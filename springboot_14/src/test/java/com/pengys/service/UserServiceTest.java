package com.pengys.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserServiceTest {
    @Autowired
    private UserService userService;

    @Test
    void findAll() {
        userService.findAll();
    }

    @Test
    void addUser(){
        userService.addUser();
    }

    @Test
    void deleteUser(){
        userService.deleteUser();
    }
}