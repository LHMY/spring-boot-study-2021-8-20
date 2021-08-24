package com.pengys;

import com.pengys.config.DBConnector;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springboot08ApplicationTests {
    @Autowired
    private DBConnector dbConnector;

    @Test
    void contextLoads() {
        dbConnector.configuration();
    }

}
