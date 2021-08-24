package com.pengys;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springboot03ApplicationTests {

    @Test
    void contextLoads() {
        System.out.println("今天是2021年8月20日");
    }

    @Test
    void userAddtest() {
        System.out.println("用户添加成功");
    }
    @Test
    void userDeleteTest() {
        System.out.println("用户删除成功");
    }
    @Test
    void userModifyTest() {
        System.out.println("用户修改成功");
    }
    @Test
    void userQueryTest() {
        System.out.println("用户查询成功");
    }


}
