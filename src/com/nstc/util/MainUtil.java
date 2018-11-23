package com.nstc.util;

import com.nstc.util.detail.SqlUtil;

public class MainUtil {
    public static void main(String[] args) throws Exception {
//        ClassUtil.buildJavaClass("DFBPC_AGING", "BpcAging", "com.nstc.dfbpc.model;");
        SqlUtil.getInsertSql("DFBPC_FI_COMMISSION");
    }
}
