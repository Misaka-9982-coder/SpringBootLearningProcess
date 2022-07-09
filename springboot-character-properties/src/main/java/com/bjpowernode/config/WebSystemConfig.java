  package com.bjpowernode.config;

import com.bjpowernode.web.MyServlet;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.CharacterEncodingFilter;

@Configuration
public class WebSystemConfig {

    @Bean
    public ServletRegistrationBean servletRegistrationBean() {
        ServletRegistrationBean registrationBean = new ServletRegistrationBean(new MyServlet());
        registrationBean.addUrlMappings("/myServlet");
        return registrationBean;
    }
}
