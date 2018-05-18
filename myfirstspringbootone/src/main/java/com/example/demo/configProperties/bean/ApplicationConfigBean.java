package com.example.demo.configProperties.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration  //也是注册被修饰的类为bean
@ConfigurationProperties(prefix = "application")
public class ApplicationConfigBean {
    private String name;
    private String want;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWant() {
        return want;
    }

    public void setWant(String want) {
        this.want = want;
    }
}
