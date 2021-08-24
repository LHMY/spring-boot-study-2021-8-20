package com.pengys;

import com.pengys.domain.Person;
import com.pengys.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springboot06ApplicationTests {
    @Autowired
    private Person person;

    @Test
    void contextLoads() {
        System.out.println(person);
    }



    @Autowired
    private User user;

    @Test
    void emailValidation(){
        System.out.println("user = " + user);

    }


}
