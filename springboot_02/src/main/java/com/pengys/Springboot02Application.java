package com.pengys;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Springboot02Application {

    public static void main(String[] args) {
        SpringApplication.run(Springboot02Application.class, args);


        // 关闭 banner 图标
        //SpringApplication springApplication = new SpringApplication(App.class);
       // springApplication.setBannerMode(Banner.Mode.OFF);
       // springApplication.run();
    }

}
