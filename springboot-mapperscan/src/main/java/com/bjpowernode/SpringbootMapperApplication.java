package com.bjpowernode;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * @MapperScan 扫描指定包下的所有Mapper接口
 *  basePackage 可以指定扫描的包路径
 */
@SpringBootApplication
@MapperScan(basePackages = {"com.bjpowernode.dao", "com.bjpowernode.mapper"})
public class SpringbootMapperApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootMapperApplication.class, args);
    }

}
