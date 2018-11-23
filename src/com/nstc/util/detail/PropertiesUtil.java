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
        // 使用ClassLoader加载properties配置文件生成对应的输入流
//        InputStream in = PropertiesUtil.class.getClassLoader().getResourceAsStream("jdbc.properties");
        InputStream in = null;
        try {
            in = new FileInputStream(PropertiesUtil.class.getResource("").getFile() + "jdbc.properties");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        // 使用properties对象加载输入流
        try {
            properties.load(in);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public  PropertiesUtil() {

    }

    public String getValue(String key) {
        //获取key对应的value值
        return properties.getProperty(key);
    }
}
