package com.bjpowernode.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

public class JspController {

    @RequestMapping("/index")
    public ModelAndView hello() {
        ModelAndView modelAndView = new ModelAndView();

        modelAndView.addObject("data", "hello");
        modelAndView.setViewName("index.jsp");

        return modelAndView;
    }
}
