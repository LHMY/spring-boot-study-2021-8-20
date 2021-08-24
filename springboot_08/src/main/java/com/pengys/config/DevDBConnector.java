package com.pengys.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile(value = "dev")
public class DevDBConnector  implements  DBConnector{

    /**
     *  对不同的环境下的数据库设置统一接口约束
     */
    public void configuration() {
        System.out.println("在开发环境下连接Mysql数据库，连接成功");
    }

}
