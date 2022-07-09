package com.bjpowernode.config;

import com.bjpowernode.web.MyServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.ServletRegistration;

@Configuration
public class WebApplicationConfig {

    // 定义方法，注册Servlet 对象
    @Bean
    public ServletRegistrationBean servletRegistrationBean() {
        ServletRegistrationBean registrationBean =
                new ServletRegistrationBean(new MyServlet(), "/myServlet");

        return registrationBean;
    }
}
