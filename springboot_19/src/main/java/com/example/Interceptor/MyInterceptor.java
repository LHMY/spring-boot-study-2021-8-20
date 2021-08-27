package com.example.Interceptor;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class MyInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //制定拦截规则
        //当你登录了，可以访问管理员主页
        //若登录成功则会把信息存入session
        Object username = request.getSession().getAttribute("userSession");
        if (username == null) {
            response.sendRedirect(request.getContextPath()+"/login");
            // 拦截
            return false;
        }
        // 放行
        return  true;
    }
}
