package com.example.demo;

import com.example.demo.configProperties.bean.ApplicationConfigBean;
import com.example.demo.configProperties.bean.TestConfigBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
//@EnableConfigurationProperties({TestConfigBean.class,ApplicationConfigBean.class}) ///*@EnableConfigurationProperties并指明要注册那个类为bean
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}

/*
*spring-boot功能 为了简化spring项目
* 1.无需手动管理依赖jar包的版本
*2.自动配置，无需xml
*/
/*
* SpringBoot内置了tomcat，而且所用的端口是8080，
* 如果被占用了就把端口号改一下，修改端口号的方法很简单 找到application.properties文件，
* 这是默认的配置文件，在里面写上server.port=8090,端口号随便改，在运行就可以了
*
*/
/*@SpringBootApplication相当于
* @Configuration
@EnableAutoConfiguration
@ComponentScan
* */