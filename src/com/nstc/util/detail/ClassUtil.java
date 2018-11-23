package com.nstc.util.detail;

import com.nstc.util.NomalString;
import com.nstc.util.model.Column;
import com.nstc.util.model.Const;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class ClassUtil {

    /**
     * @throws Exception
     * @Description: ���ݱ�ṹ����java�ļ�
     * @author shijiabo
     * @since��2018-10-25 ����04:19:49
     */
    public static void buildJavaClass(String tableName, String className, String packageName) throws Exception {
        System.out.println(">>>>>>>>>>>>>>��ʼ����ʵ����");
        List<Column> columnList = TableClass.getColumnList(tableName);

        String classPath = "E:\\JavaClass\\";
        File file = new File(classPath + className + ".java");
        // ����ļ�������ɾ����������
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
            // �������ݿ��ֶ�����ת����java����
            String type = getType(column);
            pw.println("\tprivate " + type + " " + column.getColumnName() + ";");
            pw.println();
        }
        for (Column column : columnList) {
            pw.println("\t/** " + column.getRemark() + " */");
            String type = getType(column);
            // get set����
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
        System.out.println(">>>>>>>>>>>>>>��������ʵ����");
    }

    public static String getType(Column column) {
        String type = "";
        if (Const.STRING.equals(column.getDataType())) {
            type = "String";
        } else if (Const.NUMBER.equals(column.getDataType())) {
            if (column.getDataScale() != null && column.getDataScale() > 0) {
                type = "Double";
            } else {
                type = "Integer";
            }
        } else if (Const.DATE.equals(column.getDataType())) {
            type = "Date";
        }
        return type;
    }

    /**
     * @param className
     * @return
     * @Description: ��ȡ�����������
     * @author shijiabo
     * @since��2018-10-19 ����01:40:47
     */
    public static List<String> getClassInfo(String className) {
        List<String> classList = new ArrayList<String>();
        try {
            Class<?> clazz = Class.forName(className);// ��������������Ӧ��Class����
            // д������Ҫ������������
            // ע����ȫ��
            // ����а��Ļ�Ҫ����
            // ����java.Lang.String
            Field[] fields = clazz.getDeclaredFields();// ����Class���������� ˽�е�Ҳ���Ի��
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
     * @param calzz
     * @return
     * @Description: ��ȡ���и���
     * @author shijiabo
     * @since��2018-10-19 ����01:44:29
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
