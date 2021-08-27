package com.pengys.service;

import com.pengys.annotation.InvokeLog;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{


    public final static Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Override
    @InvokeLog
    public void findAll() {
        //System.out.println("查询所有用户");
        //logger.info("开始进入findAll方法");
        logger.info("info------>查询所有用户");
        //.info("离开方法findAll");
    }


    @Override
    @InvokeLog
    public void addUser() {
        logger.info("info------>添加用户信息");
    }

    @Override
    @InvokeLog
    public void deleteUser() {
        logger.info("info------>删除用户信息");
    }
}
