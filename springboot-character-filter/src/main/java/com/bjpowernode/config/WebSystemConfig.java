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

    @Bean
    public FilterRegistrationBean filterRegistrationBean() {
        FilterRegistrationBean registrationBean = new FilterRegistrationBean();

        // 使用框架中的过滤器
        CharacterEncodingFilter characterEncodingFilter = new CharacterEncodingFilter();
        // 使用指定的编码方式
        characterEncodingFilter.setEncoding("UTF-8");
        // 指定 request ， response 的编码方式
        characterEncodingFilter.setForceEncoding(true);

        registrationBean.setFilter(characterEncodingFilter);
        // 指定过滤器应用的路径
        registrationBean.addUrlPatterns("/*");

        return registrationBean;
    }
}
