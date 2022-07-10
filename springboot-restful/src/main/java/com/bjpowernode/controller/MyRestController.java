package com.bjpowernode.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class MyRestController {


    /**
     * @PathVariable: 路径变量，可以接收请求路径中的参数
     *  {stuId}: 路径变量的名称, stuId 为自定义的变量名称
     */
    @GetMapping("/student/{stuId}")
    public String queryStudent(@PathVariable("stuId") Integer studentId) {
        return "studentId: " + studentId;
    }


    @PostMapping("/student/{name}/{age}")
    public String createStudent(@PathVariable("name") String name,
                                @PathVariable("age") Integer age) {
        return "create name: " + name + "#age: " + age;
    }

    /**
     *
     * 当 路径变量名称 和 形参名 一致时，可以省略路径变量名称
     */
    @PutMapping("/student/{id}/{age}")
    public String modifyStudent(@PathVariable Integer id,
                                @PathVariable Integer age) {
        return "modify studentId: " + id + "#age: " + age;
    }

    @DeleteMapping("/student/{id}")
    public String deleteStudent(@PathVariable Integer id) {
        return "delete studentId: " + id;
    }

//    @PostMapping("/student/test")
//    public String test() {
//        return "test, use the post method to test";
//    }

    @PutMapping("/student/test")
    public String test() {
        return "test, use the put method to test";
    }

    @DeleteMapping("/student/testDelete")
    public String testDelete() {
        return "test, use the delete method to test";
    }
}
