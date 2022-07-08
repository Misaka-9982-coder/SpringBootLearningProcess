package com.bjpowernode;

import com.bjpowernode.service.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringbootContainerApplication {

    public static void main(String[] args) {
//        ConfigurableApplicationContext ctx =  SpringApplication.run(SpringbootContainerApplication.class, args);
        ApplicationContext ctx =  SpringApplication.run(SpringbootContainerApplication.class, args);

        UserService userService = (UserService) ctx.getBean("userService");

        userService.sayHello("张三");
    }

}
