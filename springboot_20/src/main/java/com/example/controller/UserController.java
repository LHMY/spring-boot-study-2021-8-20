package com.example.controller;


import com.example.User;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

    @GetMapping("/register")
    public String showRegistryPage(){
        return "registerUser";
    }

    @RequestMapping("/addUser")
    @ResponseBody
    public String addUser(@Validated User user){

      return  "注册成功,用户信息为：" + user;
    }
}
