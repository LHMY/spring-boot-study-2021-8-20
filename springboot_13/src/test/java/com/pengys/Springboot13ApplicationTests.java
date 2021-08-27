package com.pengys;

import org.junit.jupiter.api.Test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springboot13ApplicationTests {

    private Logger logger = LoggerFactory.getLogger(Springboot13ApplicationTests.class);

//debug->info->error->warn
    @Test
    void contextLoads() {
        logger.warn("我是警告");
        logger.info("我是info");
        logger.debug("我是debug");
        logger.error("我是error");

    }

}
