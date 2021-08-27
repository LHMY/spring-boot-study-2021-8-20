package com.pengys.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Calendar;

@Controller
public class IndexController {

    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String showLoginPage(){
        return "login";
    }
    @RequestMapping(value = "/toLoginPage",method = RequestMethod.GET)
    public String toLoginPage(Model model){
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        model.addAttribute("currentYear",currentYear);
        return "login";
    }


    @RequestMapping("/myhome")
    public String index(){

        return "home";
    }
}
