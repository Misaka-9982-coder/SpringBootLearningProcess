package com.bjpowernode;

import com.bjpowernode.service.HelloService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.Resource;

@SpringBootApplication
public class SpringbootCommandlinerunnerApplication implements CommandLineRunner {

    @Resource
    private HelloService helloService;

    public static void main(String[] args) {
        System.out.println("prepare to create container object");
        SpringApplication.run(SpringbootCommandlinerunnerApplication.class, args);
        System.out.println("container object created");
    }

    @Override
    public void run(String... args) throws Exception {
        String str = helloService.sayHello("张三");
        System.out.println("Hello World!" + str);
        System.out.println("The End!");

    }
}
