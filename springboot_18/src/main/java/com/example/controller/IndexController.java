package com.example.controller;


import com.example.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;


@Controller
public class IndexController {


    @GetMapping(value="/pengys")
    public String index(Model model){
        model.addAttribute("name","pengyusheng");
        return "index";

    }


    @GetMapping("/userlist")
    public String showUserList(Model model){
        //getset方法
        //User user1 = new User();
        //user1.setUsername("pengys");
        //user1.setUserage(100);
        User wukong = new User(100,"wukong");
        User tangseng = new User(200,"tangsheng");
        User bajie = new User(300,"bajie");
        User shaseng = new User(400,"shaseng");

        ArrayList userList = new ArrayList();
        userList.add(wukong);
        userList.add(tangseng);
        userList.add(bajie);
        userList.add(shaseng);
        model.addAttribute("userList",userList);
        model.addAttribute("name","pengyusheng");
        return "index";
    }
}
