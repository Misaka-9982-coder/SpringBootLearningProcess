package com.bjpowernode;

import com.bjpowernode.config.SpringConfig;
import com.bjpowernode.vo.Cat;
import com.bjpowernode.vo.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStudent {
    @Test
    public void testBeansTagStudent() {
        String config = "beans.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(config);
        Student student = (Student) ctx.getBean("myStudent");
        System.out.println("容器中的对象：" + student);
    }

    @Test
    public void testBeansConfigStudent() {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        Student student = (Student) ctx.getBean("createStudent");
        System.out.println("使用JavaConfig创建的对象：" + student);
    }

    @Test
    public void testBeansConfigStudent2() {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        Student student = (Student) ctx.getBean("LiSiStudent");
        System.out.println("使用JavaConfig创建的对象：" + student);
    }

    @Test
    public void testImportResource() {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        Cat cat = (Cat) ctx.getBean("myCat");
        System.out.println("cat == " + cat);
    }
}
