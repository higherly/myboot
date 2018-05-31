package com.example.demo.redis;

import com.example.demo.configProperties.bean.TestConfigBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/**
 *关于解释，如果在DemoApplication添加了@EnableConfigurationProperties({TestConfigBean.class,ApplicationConfigBean.class}) 或者
 * TestConfigBean类上添加注解 ,则会实例化两个bean，此时@Autowired private TestConfigBean testConfigBean; 会出现找不到情况.
 */
/*
* Repository的用法 用于标注数据访问组件，即DAO组件
* */
@RestController
@RequestMapping("/redis/")
public class RedisController {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @ResponseBody
    @RequestMapping("test1")
    public String test2(){
        ValueOperations<String, String> ops1 = stringRedisTemplate.opsForValue();
        System.out.println(ops1.get("haha"));
        return "ok";
    }
}
