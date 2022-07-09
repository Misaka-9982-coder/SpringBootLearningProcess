package com.bjpowernode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BootController {

    @RequestMapping("/user/account")
    @ResponseBody
    public String UserAccount() {
        return "view /user/account";
    }

    @RequestMapping("/user/login")
    @ResponseBody
    public String UserLogin() {
        return "view /user/login";
    }
}
