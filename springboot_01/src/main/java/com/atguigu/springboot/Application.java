package com.atguigu.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/*
 *@SpringBootApplication 组合注解，含有：
 *      @SpringBootConfiguration   等价于@Configuration(spring提供的) ，声明配置类
 *      @EnableAutoConfiguration   启用自动配置
 *      @ComponentScan  包扫描，扫描主程序所在的包以及子包
 *
 *
 * */
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
