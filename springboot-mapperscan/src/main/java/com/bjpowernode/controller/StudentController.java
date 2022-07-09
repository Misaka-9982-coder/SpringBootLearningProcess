package com.bjpowernode.controller;

import com.bjpowernode.model.Student;
import com.bjpowernode.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class StudentController {

    @Resource
    private StudentService studentService;

    @RequestMapping("/student/query")
    @ResponseBody
    public String query(Integer id) {
        Student student = studentService.SelectStudentById(id);
        return student.toString();
    }
}
