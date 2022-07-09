package com.bjpowernode.web;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginInterceptor implements HandlerInterceptor {

    /**
     * 在请求处理之前进行调用（Controller方法调用之前）
     * @param request
     * @param response
     * @param handler  被拦截的控制器对象
     * @return boolen
     *  true: 请求能被继续执行
     *  false：请求被拦截
     * @throws Exception
     */
    @Override
    public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response,
                             Object handler) throws Exception {

        System.out.println("LoginInterceptor.preHandle");
        return true;
    }
}
