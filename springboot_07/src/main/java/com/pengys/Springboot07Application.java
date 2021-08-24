package com.pengys;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource(value = "classpath:MyBeans.xml")
public class Springboot07Application {

    public static void main(String[] args) {
        SpringApplication.run(Springboot07Application.class, args);
    }

}
