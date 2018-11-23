package com.nstc.util.detail;

import com.nstc.util.model.Const;

import java.util.List;

public class IbatisUtil {

    /**
     * @throws ClassNotFoundException
     * @Description: ¹¹½¨ibatis resultMap
     * @author shijiabo
     * @since£º2018-10-19 ÏÂÎç01:39:23
     */
    public static void getResultMap(String className) throws ClassNotFoundException {
        List<String> classList = ClassUtil.getClassInfo(Const.packageName + className);
        Class<?> clazz = Class.forName(Const.packageName + className);
        List<Class<?>> l = ClassUtil.getsuperClass(clazz);
        for (Class<?> class1 : l) {
            classList.addAll(ClassUtil.getClassInfo(class1.getName()));
        }
        for (String string : classList) {
            System.out.println("<result property=\"" + string + "\" column=\"" + string + "\"/>");
        }
    }
}
