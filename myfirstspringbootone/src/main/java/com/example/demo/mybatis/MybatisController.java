package com.example.demo.mybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2018/5/21.
 */
@Controller
@RequestMapping("/mybatis/")
@MapperScan("com.example.demo.mybatis.dao")/*其作用是根据Mapper接口获取我们想要的Mapper对象*/
public class MybatisController {

    @Autowired
    private UserService userService;

    @RequestMapping("get")
    @ResponseBody
    public String get(){
        List<Map<String,Object>> list = userService.get();
        System.out.println(list);
        return "ok";
    }
}
