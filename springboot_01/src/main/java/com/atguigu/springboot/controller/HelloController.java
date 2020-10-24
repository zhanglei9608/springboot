package com.atguigu.springboot.controller;

import com.atguigu.springboot.bean.DataSourceProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController  //组合注解 @Controller + @ResponseBody
public class HelloController {
    //@Autowired  //Spring 框架提供的， 先bytype,在byname
    @Resource  //jdk 提供的，先byname,在bytype
    DataSourceProperties dataSourceProperties;

    @RequestMapping("/hello")
    public String sayHello(){
        System.out.println(dataSourceProperties);
        return "hello spring boot!!" ;
    }
}

