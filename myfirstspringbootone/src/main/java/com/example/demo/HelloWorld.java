package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * mvn clean spring-boot:run 重新启动项目
 */
@Controller
@RequestMapping("/test")
public class HelloWorld {

    @ResponseBody
    @RequestMapping("/test1")
    public String test(){
        System.out.println(112221221);
        return "OK";
    }
}
