package com.example.config;

import com.example.Interceptor.MyInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@Configuration
public class MyMvcConfig implements WebMvcConfigurer {

    @Autowired
    private MyInterceptor myInterceptor;

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {

        //类似于@GetMapping(value="/pengys")，这是另一种写法
        registry.addViewController("/login").setViewName("login");
        registry.addViewController("/home").setViewName("home");
    }
    //拦截器
    //哪些请求是需要拦截器的过滤的?
    @Override
    public void addInterceptors(InterceptorRegistry registry){
        registry.addInterceptor(myInterceptor).addPathPatterns("/**").excludePathPatterns("/login");

    }

}
