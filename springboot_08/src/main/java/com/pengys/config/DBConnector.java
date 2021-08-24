package com.pengys.config;

public interface DBConnector {

    /**
     *  对不同的环境下的数据库设置统一接口约束
     */
    void configuration();

}
