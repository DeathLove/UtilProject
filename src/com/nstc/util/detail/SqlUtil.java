package com.nstc.util.detail;

import com.nstc.util.model.Column;

import java.sql.SQLException;
import java.util.List;

public class SqlUtil {

    /**
     * @param tableName
     * @throws ClassNotFoundException
     * @throws SQLException
     * @Description: ����ʵ�幹��oracle�������
     * @author shijiabo
     * @since��2018-10-19 ����01:39:40
     */
    public static void getInsertSql(String tableName) throws ClassNotFoundException, SQLException {
        // 1. ��ȡ��ṹ
        List<Column> columnList = TableClass.getColumnList(tableName);
        // 2. ��ȡʵ����
//		List<String> classList = new ArrayList<String>();
//		classList = getClassInfo("com.nstc.util.javatmp.BpcBalanceTmp");
//		classList.addAll(getClassInfo("com.nstc.util.javatmp.BpcBalance"));// ����
        // 3. ����SQL
        // 3.1 ����
//		Collections.sort(columnList);
//		Collections.sort(classList);
//		if (columnList.size() != classList.size()) {
//			throw new RuntimeException("��ṹ�������Բ���, ����!");
//		}
        // 3.2 ƴ��
        StringBuffer sb = new StringBuffer();
        sb.append("INSERT INTO ");
        sb.append(tableName);
        sb.append("(");
        for (int i = 0; i < columnList.size(); i++) {
            sb.append(columnList.get(i).getColumnName());
            if (i < columnList.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append(") VALUES (");
        for (int i = 0; i < columnList.size(); i++) {
            if ("BUKRS".equals(columnList.get(i).getColumnName())) {
                sb.append("'997'");
            } else {
                sb.append("#" + columnList.get(i).getColumnName() + "#");
            }
            if (i < columnList.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append(")");
        System.out.println(sb.toString());
    }

    /**
     * @param tableName
     * @throws ClassNotFoundException
     * @throws SQLException
     * @Description: oracleȫ���ֶβ�ѯ���
     * @author shijiabo
     * @since��2018-10-19 ����01:40:26
     */
    public static void getSelectSql(String tableName) throws ClassNotFoundException, SQLException {
        // 1. ��ȡ��ṹ
        List<Column> columnList = TableClass.getColumnList(tableName);
        // 2. ƴ��sql
        StringBuffer sb = new StringBuffer();
        sb.append("SELECT ");
        for (int i = 0; i < columnList.size(); i++) {
            sb.append(columnList.get(i).getColumnName()).append(" AS ").append("\"").append(columnList.get(i).getColumnName()).append("\"");
            if (i < columnList.size() - 1) {
                sb.append(" ,");
            }
        }
        sb.append(" FROM ");
        sb.append(tableName);
        System.out.println(sb.toString());
    }
}
