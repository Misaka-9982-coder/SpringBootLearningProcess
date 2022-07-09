package com.bjpowernode.config;

import com.bjpowernode.web.LoginInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

// 添加拦截器对象，注入到容器中
@Configuration
public class MyAppConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 注册拦截器
        HandlerInterceptor interceptor = new LoginInterceptor();

        // 指定拦截器拦截的路径
        String path [] = {"/user/**"};

        // 指定不拦截的路径
        String excludePath [] = {"/user/login"};

        registry.addInterceptor(interceptor).addPathPatterns(path).excludePathPatterns(excludePath);
    }
}
