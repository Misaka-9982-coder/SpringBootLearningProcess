package com.bjpowernode.Controller;

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

    @RequestMapping("/addStudent")
    @ResponseBody
    public String addStudent(String name, Integer age) {
        Student student = new Student();
        student.setName(name);
        student.setAge(age);
        int rows = studentService.addStudent(student);
        return "add students : rows=" + rows;
    }
}
