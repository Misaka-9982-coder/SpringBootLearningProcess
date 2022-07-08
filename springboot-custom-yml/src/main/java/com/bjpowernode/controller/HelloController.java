package com.bjpowernode.controller;

import com.bjpowernode.vo.SchoolInfo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

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

    @Resource
    SchoolInfo info;

    @RequestMapping("/data")
    @ResponseBody
    public String QueryData() {
        return "端口号：" + port
                + "，上下文路径：" + contextPath
                + "，学校名称：" + name
                + "，网站地址：" + site;
    }

    @RequestMapping("/info")
    @ResponseBody
    public String QueryInfo() {
        return "SchoolInfo == " + info.toString();
    }
}
