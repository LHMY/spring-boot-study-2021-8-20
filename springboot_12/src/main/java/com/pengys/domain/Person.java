package com.pengys.domain;/*
author: 悟空非空也（B站/知乎/公众号）
*/

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;
import org.springframework.data.redis.core.index.Indexed;

import java.util.List;

@Data
@RedisHash(value = "people")
public class Person {

    @Id
    private  String id;
    @Indexed
    private  String firstName;
    @Indexed
    private  String lastName;
    private  Address address;
    private List<Family> familyList;
}