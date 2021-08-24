package com.pengys.domain;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;




@Component
@Data
@ConfigurationProperties(
        prefix = "person",
        ignoreUnknownFields = true
)
public class Person {

    private  Integer id;
    private String name;
    private String[] family;
    private List hobbies;
    private Map map;

    private Pet pet;

}
