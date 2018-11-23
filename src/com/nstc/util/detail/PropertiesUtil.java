package com.nstc.util.detail;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesUtil {

    private static Properties properties;

    static {
        properties = new Properties();
        // ʹ��ClassLoader����properties�����ļ����ɶ�Ӧ��������
//        InputStream in = PropertiesUtil.class.getClassLoader().getResourceAsStream("jdbc.properties");
        InputStream in = null;
        try {
            in = new FileInputStream(PropertiesUtil.class.getResource("").getFile() + "jdbc.properties");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        // ʹ��properties�������������
        try {
            properties.load(in);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public  PropertiesUtil() {

    }

    public String getValue(String key) {
        //��ȡkey��Ӧ��valueֵ
        return properties.getProperty(key);
    }
}
