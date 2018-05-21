package com.example.demo.redis;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * Created by Administrator on 2018/5/21.
 */
@Configuration
@PropertySource(value = "classpath:redis.properties")
@ConfigurationProperties
public class RedisConfig {
}
