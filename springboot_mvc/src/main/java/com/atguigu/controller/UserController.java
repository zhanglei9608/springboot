package com.atguigu.controller;

import com.atguigu.bean.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {

    @GetMapping("/findAll")
    public List<User> findAll(){
        //查询所有
        List<User> users = new ArrayList<User>();

        User user1 = new User();
        user1.setUsername("杨过");
        user1.setPassword("123456");
        user1.setAge(18);
        user1.setSex("男");

        User user2 = new User();
        user2.setUsername("杨过");
        user2.setPassword("123456");
        user2.setAge(18);
        user2.setSex("男");

        User user3 = new User();
        user3.setUsername("杨过");
        user3.setPassword("123456");
        user3.setAge(18);
        user3.setSex("男");

        users.add(user1);
        users.add(user2);
        users.add(user3);

        return users ;
    }
}
