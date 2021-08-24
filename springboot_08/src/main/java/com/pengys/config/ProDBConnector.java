package com.pengys.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile(value = "prod")
public class ProDBConnector  implements  DBConnector{

    public void configuration() {
        System.out.println("在生产环境下,连接Oracle数据库,连接成功");
    }
}
