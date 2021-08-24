package com.pengys.domain;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import javax.validation.constraints.Email;

@Component
@Data
@ConfigurationProperties(
        prefix = "user",
        ignoreUnknownFields = true
)
public class User {
    @Email
    private String mail;
}
