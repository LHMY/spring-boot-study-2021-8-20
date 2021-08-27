package com.pengys.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImpl implements UserService{


    public final static Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Override

    public void findAll() {
        //System.out.println("查询所有用户");
        //logger.info("开始进入findAll方法");
        logger.info("info------>查询所有用户");
        //.info("离开方法findAll");
    }
    //增删改上添加 该注解即可 （查询不需要）
    @Transactional
    public void addUser() {
        logger.info("info------>添加用户信息");
    }

}
