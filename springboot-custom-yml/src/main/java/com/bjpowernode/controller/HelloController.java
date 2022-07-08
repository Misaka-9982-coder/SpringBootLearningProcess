package com.bjpowernode.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @Value("${server.port}")
    private Integer port;

    @Value("${server.servlet.context-path}")
    private String contextPath;

    @Value("${school.name}")
    private String name;

    @Value("${site}")
    private String site;

    @RequestMapping("/data")
    @ResponseBody
    public String QueryData() {
         return "端口号：" + port
                 + "，上下文路径：" + contextPath
                 + "，学校名称：" + name
                 + "，网站地址：" + site;
    }
}
