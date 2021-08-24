package com.pengys.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile(value = "test")
public class TestDBConnector implements DBConnector{

    @Override
    public void configuration() {
        System.out.println("在测试环境下，连接Sqlite数据库，连接成功");
    }
}
