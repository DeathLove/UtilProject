package com.nstc.util.detail;

import com.nstc.util.model.Column;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TableClass {

    /**
     * @param tableName
     * @return
     * @throws ClassNotFoundException
     * @throws SQLException
     * @Description: 获取表的所有字段
     * @author shijiabo
     * @since：2018-10-19 下午01:41:01
     */
    public static List<Column> getColumnList(String tableName) throws ClassNotFoundException, SQLException {
        // 1. 获取表结构
        List<Column> list = new ArrayList<Column>();
        PropertiesUtil util = new PropertiesUtil();
        Class.forName(util.getValue("classname"));
        String url = util.getValue("url");
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url, util.getValue("username"),
                    util.getValue("password"));
            String sql = "SELECT U1.COLUMN_NAME AS \"COLUMN_NAME\" , U1.DATA_TYPE AS \"DATA_TYPE\",\n" +
                    "       U2.COMMENTS AS \"COMMENTS\" , U1.DATA_SCALE AS \"DATA_SCALE\"\n" +
                    " FROM USER_TAB_COLUMNS U1 JOIN USER_COL_COMMENTS U2 ON U1.TABLE_NAME=U2.TABLE_NAME AND U1.COLUMN_NAME=U2.COLUMN_NAME\n" +
                    " WHERE U1.TABLE_NAME='" + tableName + "' ORDER BY U1.COLUMN_ID";
            ResultSet rs = connection.createStatement().executeQuery(sql);
            int i = 1;
            while (rs.next()) {
                Column col = new Column();
                String columnName = rs.getString("COLUMN_NAME");
                String remarks = rs.getString("COMMENTS");
                String dataType = rs.getString("DATA_TYPE");
                Integer dataScale = rs.getInt("DATA_SCALE");
                col.setColumnName(columnName);
                col.setRemark(remarks);
                col.setDataScale(dataScale);
                col.setDataType(dataType);
                list.add(col);
                i++;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            connection.close();
        }
        return list;
    }
}
