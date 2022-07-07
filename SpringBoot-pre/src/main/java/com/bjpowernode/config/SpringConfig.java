package com.bjpowernode.config;

import com.bjpowernode.vo.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;


// 表示当前类作为配置类使用的：配置容器
@Configuration
@ImportResource(value = "classpath:applicationContext.xml")
public class SpringConfig {

    /*
     * 创建方法，方法的返回值是对象，在方法的上面加入@Bean
     * 方法的返回值对象就注入到容器中
     *
     * @Bean: 把对象注入到 Spring 容器中， 作用相当于 <bean></bean>
     *
     * 说明：@Bean，不指定对象的名称，默认的名称就是方法名
     */
    @Bean
    public Student createStudent() {
        Student student = new Student();
        student.setName("张三");
        student.setAge(20);
        student.setSex("男");
        return student;
    }

    /*
     * 指定对象在容器中的名称（指定<bean>的 id 属性）
     * @Bean 的 name 属性，可以指定对象的名称
     */
    @Bean(name = "LiSiStudent")
    public Student makeStudent() {
        Student student1 = new Student();
        student1.setName("李四");
        student1.setAge(21);
        student1.setSex("男");
        return student1;
    }
}
