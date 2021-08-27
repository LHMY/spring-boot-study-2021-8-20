package com.example;

import org.hibernate.validator.constraints.Length;
import org.springframework.validation.annotation.Validated;
import javax.validation.constraints.NotBlank;

@Validated
public class User {

    @NotBlank(message ="用户名不能为空哈")
    private String username;

    @Length(min =1 ,max = 10,message = "密码长度为1~10之间哈")
    @NotBlank(message = "用户密码不能为空!")
    private String password;


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
