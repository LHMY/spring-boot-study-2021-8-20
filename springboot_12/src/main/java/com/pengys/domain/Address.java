package com.pengys.domain;


import lombok.Data;
import org.springframework.data.redis.core.index.Indexed;

@Data
public class Address {
    @Indexed
    private  String nation;

    @Indexed
    private  String village;
}
