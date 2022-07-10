package com.bjpowernode.controller;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class RedisController {

    @Resource
    private RedisTemplate redisTemplate;

    @Resource
    private StringRedisTemplate stringRedisTemplate;

    // add data to redis
    @PostMapping("/redis/addString")
    public String addToRedis(String name, String value) {

        // 操作 Redis 中 String 类型的数据，先获取 ValueOperations 对象
        ValueOperations valueOperations = redisTemplate.opsForValue();

        // 将数据存入 Redis
        valueOperations.set("myname", "lisi");

        return "add string date to redis";
    }


    // get data from redis
    @GetMapping("/redis/getString")
    public String getFromRedis(String name) {

        // 操作 Redis 中 String 类型的数据，先获取 ValueOperations 对象
        ValueOperations valueOperations = redisTemplate.opsForValue();

        // 从 Redis 中获取数据
        String value = (String) valueOperations.get(name);

        return "name = " + name + " value = " + value;
    }


    @PostMapping("/redis/{key}/{value}")
    public String addStringKV(@PathVariable String key,
                              @PathVariable String value) {
        stringRedisTemplate.opsForValue().set(key, value);

        return "use StringRedisTemplate add key-value";
    }

    @GetMapping("/redis/{key}")
    public String getStringKV(@PathVariable String key) {
        String value = stringRedisTemplate.opsForValue().get(key);

        return "use StringRedisTemplate get key-value, key = " + key + " value = " + value;
    }
}
