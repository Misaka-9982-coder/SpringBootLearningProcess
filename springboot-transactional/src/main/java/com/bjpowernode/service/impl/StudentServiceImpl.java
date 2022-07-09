package com.bjpowernode.service.impl;

import com.bjpowernode.dao.StudentMapper;
import com.bjpowernode.model.Student;
import com.bjpowernode.service.StudentService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
public class StudentServiceImpl implements StudentService {

    @Resource
    private StudentMapper studentMapper;


    /**
     * @Transactional: 标识此方法是一个事务方法
     * 默认使用数据库的隔离级别，Required 传播行为，超时时间 -1
     * 抛出运行时异常，回滚事务
     * @param student
     * @return
     */
    @Transactional
    @Override
    public int addStudent(Student student) {
        System.out.println("StudentServiceImpl.addStudent()");
        int rows = studentMapper.insert(student);
        System.out.println("rows=" + rows);

        // 抛出运行时异常，测试事务回滚
//        int m = 1 / 0;
        return rows;
    }
}
