package com.example.demo.configProperties;

import com.example.demo.configProperties.bean.ApplicationConfigBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 配置文件详解
 */
@RestController
@RequestMapping("/pro")
public class ApplicationController {

    @Value("${application.name}")
    private String applicationName;

    /*自定义加载配置文件对象*/
    @Autowired
    private ApplicationConfigBean applicationConfigBean;

    @RequestMapping("/test1")
    public String test(){
        System.out.println(applicationName);
        return applicationName;
    }
    @RequestMapping("/test2")
    public String test2(){
        System.out.println(applicationConfigBean.getWant());
        return applicationConfigBean.getWant();
    }
}
