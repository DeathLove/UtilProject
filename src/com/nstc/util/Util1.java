package com.nstc.util;

import com.nstc.util.model.Column;
import com.nstc.util.model.Const;

import java.io.*;
import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

/**
 * <p>Title: </p>
 *
 * <p>Description: </p>
 *
 * <p>Company: 北京九恒星科技股份有限公司</p>
 *
 * @author shijiabo
 * @since：2018-10-18 下午04:30:56
 */
public class Util1 {


    /**
     * @throws Exception
     * @Description: 根据表结构生成java文件
     * @author shijiabo
     * @since：2018-10-25 下午04:19:49
     */
    public static void buildJavaClass(String tableName, String className, String packageName) throws Exception {
        System.out.println(">>>>>>>>>>>>>>开始导出实体类");
        List<Column> columnList = getColumnList(tableName);

        String classPath = "E:\\JavaClass\\";
        File file = new File(classPath + className + ".java");
        // 如果文件存在则删除重新生成
        if (file.exists()) {
            file.delete();
            file = new File(classPath + className + ".java");
        }
        if (!file.exists()) {
            file.getParentFile().mkdirs();
        }
        FileWriter fw = new FileWriter(file, true);
        PrintWriter pw = new PrintWriter(fw);
        pw.println("package " + packageName);
        pw.println();
        pw.println("import java.io.Serializable;");
        pw.println();
        pw.println("import java.util.Date;");
        pw.println();
        pw.println("public class " + className + " implements Serializable { ");
        pw.println();

        for (Column column : columnList) {
            pw.println("\t/** " + column.getRemark() + " */");
            // 根据数据库字段类型转换成java类型
            String type = getType(column);
            pw.println("\tprivate " + type + " " + column.getColumnName() + ";");
            pw.println();
        }
        for (Column column : columnList) {
            pw.println("\t/** " + column.getRemark() + " */");
            String type = getType(column);
            // get set方法
            pw.println("\tpublic " + type + " get" + NomalString.toUpperCaseFirstOne(column.getColumnName()) + "() {");
            pw.println("\t\t return " + column.getColumnName() + ";");
            pw.println("\t}");
            pw.println();
            pw.println("\tpublic void set" + NomalString.toUpperCaseFirstOne(column.getColumnName()) + "(" + type + " " + column.getColumnName() + ") {");
            pw.println("\t\tthis." + column.getColumnName() + " = " + column.getColumnName() + ";");
            pw.println("\t}");
            pw.println();
        }
        pw.println("}");
        pw.flush();
        fw.flush();
        pw.close();
        fw.close();
        System.out.println(">>>>>>>>>>>>>>结束导出实体类");
    }

    public static String getType(Column column) {
        String type = "";
        if (Const.STRING.equals(column.getDataType())) {
            type = "String";
        } else if (Const.NUMBER.equals(column.getDataType())) {
            if (column != null && column.getDataScale() > 0) {
                type = "Integer";
            } else {
                type = "Double";
            }
        } else if (Const.DATE.equals(column.getDataType())) {
            type = "Date";
        }
        return type;
    }

    /**
     * @throws ClassNotFoundException
     * @Description: 构建ibatis resultMap
     * @author shijiabo
     * @since：2018-10-19 下午01:39:23
     */
    public static void getResultMap(String className) throws ClassNotFoundException {
        List<String> classList = getClassInfo(Const.packageName + className);
        Class<?> clazz = Class.forName(Const.packageName + className);
        List<Class<?>> l = getsuperClass(clazz);
        for (Class<?> class1 : l) {
            classList.addAll(getClassInfo(class1.getName()));
        }
        for (String string : classList) {
            System.out.println("<result property=\"" + string + "\" column=\"" + string + "\"/>");
        }
    }

    /**
     * @param tableName
     * @throws ClassNotFoundException
     * @throws SQLException
     * @Description: 根据实体构建oracle插入语句
     * @author shijiabo
     * @since：2018-10-19 下午01:39:40
     */
    public static void getInsertSql(String tableName) throws ClassNotFoundException, SQLException {
        // 1. 获取表结构
        List<Column> columnList = getColumnList(tableName);
        // 2. 获取实体类
//		List<String> classList = new ArrayList<String>();
//		classList = getClassInfo("com.nstc.util.javatmp.BpcBalanceTmp");
//		classList.addAll(getClassInfo("com.nstc.util.javatmp.BpcBalance"));// 父类
        // 3. 生成SQL
        // 3.1 排序
//		Collections.sort(columnList);
//		Collections.sort(classList);
//		if (columnList.size() != classList.size()) {
//			throw new RuntimeException("表结构与类属性不符, 请检查!");
//		}
        // 3.2 拼接
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
     * @Description: 类之间属性转换
     * @author shijiabo
     * @since：2018-10-19 下午01:40:03
     */
    public static void getCastInfo() {
        List<String> classList = new ArrayList<String>();
        classList = getClassInfo("com.nstc.util.javatmp.GlsBalance");
//		classList.addAll(getClassInfo("com.nstc.util.javatmp.BpcVch"));// 父类

        List<String> classList2 = new ArrayList<String>();
        classList2.addAll(getClassInfo("com.nstc.util.javatmp.BpcBalance"));
//		Collections.sort(classList);
//		Collections.sort(classList2);

        for (int i = 0; i < classList2.size(); i++) {
            System.out.println("bpcBalance.set" + classList2.get(i) + "(glsBalance.get" + classList.get(i) + "());");
        }
    }

    /**
     * @param tableName
     * @throws ClassNotFoundException
     * @throws SQLException
     * @Description: oracle全表字段查询语句
     * @author shijiabo
     * @since：2018-10-19 下午01:40:26
     */
    public static void getSelectSql(String tableName) throws ClassNotFoundException, SQLException {
        // 1. 获取表结构
        List<Column> columnList = getColumnList(tableName);
        // 2. 拼接sql
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

    public static void main(String[] args) {
        try {
//			getInsertSql("DFBPC_FI_TRANS");
//			getResultMap("BpcSuBalance");
//			getCastInfo();
//			getSelectSql("DFBPC_AGING");
//            buildJavaClass("DFBPC_AGING", "BpcAging", "com.nstc.dfbpc.model;");
//            System.out.println(Util1.class.getResource("") + "jdbc.properties");
//            System.out.println(Util1.class.getResource("").getFile() + "jdbc.properties");
            File file = new File("D:\\dev\\workspace\\cwjt\\UtilProject\\out\\production\\UtilProject\\com\\nstc\\util\\detail\\jdbc.properties");
            InputStream in = new FileInputStream(file);
            Properties properties = new Properties();
            properties.load(in);
            System.out.println(properties.getProperty("url"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * @param className
     * @return
     * @Description: 获取类的所有属性
     * @author shijiabo
     * @since：2018-10-19 下午01:40:47
     */
    public static List<String> getClassInfo(String className) {
        List<String> classList = new ArrayList<String>();
        try {
            Class<?> clazz = Class.forName(className);// 根据类名获得其对应的Class对象
            // 写上你想要的类名就是了
            // 注意是全名
            // 如果有包的话要加上
            // 比如java.Lang.String
            Field[] fields = clazz.getDeclaredFields();// 根据Class对象获得属性 私有的也可以获得
            for (Field f : fields) {
                if ("serialVersionUID".equals(f.getName())) {
                    continue;
                }
                classList.add(f.getName());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return classList;
    }

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
        Class.forName("oracle.jdbc.driver.OracleDriver");
        String url = "jdbc:oracle:thin:@192.168.60.20:1521:nstc";
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url, "dfcwsms1030",
                    "11111111");
            String sql = "SELECT U1.COLUMN_NAME AS \"COLUMN_NAME\" , U1.DATA_TYPE AS \"DATA_TYPE\",\n" +
                    "       U2.COMMENTS AS \"COMMENTS\" , U1.DATA_SCALE AS \"DATA_SCALE\"\n" +
                    " FROM USER_TAB_COLUMNS U1 JOIN USER_COL_COMMENTS U2 ON U1.TABLE_NAME=U2.TABLE_NAME AND U1.COLUMN_NAME=U2.COLUMN_NAME\n" +
                    " WHERE U1.TABLE_NAME='" + tableName + "'";
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

    /**
     * @param calzz
     * @return
     * @Description: 获取所有父类
     * @author shijiabo
     * @since：2018-10-19 下午01:44:29
     */
    public static List<Class<?>> getsuperClass(Class<?> calzz) {
        List<Class<?>> listSuperClass = new ArrayList<Class<?>>();
        Class<?> superclass = calzz.getSuperclass();
        while (superclass != null) {
            if (superclass.getName().equals("java.lang.Object")) {
                break;
            }
            listSuperClass.add(superclass);
            superclass = superclass.getSuperclass();
        }
        return listSuperClass;
    }
}
