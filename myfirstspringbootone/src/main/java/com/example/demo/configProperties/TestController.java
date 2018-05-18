package com.example.demo.configProperties;

import com.example.demo.configProperties.bean.TestConfigBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *关于解释，如果在DemoApplication添加了@EnableConfigurationProperties({TestConfigBean.class,ApplicationConfigBean.class}) 或者
 * TestConfigBean类上添加注解 ,则会实例化两个bean，此时@Autowired private TestConfigBean testConfigBean; 会出现找不到情况.
 */
/*
* Repository的用法 用于标注数据访问组件，即DAO组件
* */
@RestController
@RequestMapping("config/")
public class TestController {

   @Value("${test.name}")
   private String testName;

   @Autowired
  // @Qualifier("testConfigBean")
    // 对于多个实例时，表指定了哪个实现类才是我们所需要的
   private TestConfigBean testConfigBean;

    @RequestMapping("test1")
    public String test2(){

        System.out.println(testConfigBean);
        return testName;
    }
}
