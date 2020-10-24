package com.atguigu.service.impl;

import com.atguigu.dao.UserMapper;
import com.atguigu.pojo.User;
import com.atguigu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Autowired
    RedisTemplate redisTemplate;

    @Override
    @Transactional(readOnly = true ,propagation = Propagation.SUPPORTS)
    public List<User> findAll() {
        List<User> users = (List<User>) redisTemplate.boundValueOps("userkey").get();
        if (users == null) {  //缓存中没有
            users = userMapper.selectAll();
            System.out.println("从数据库中users = " + users);
            redisTemplate.boundValueOps("userkey").set(users);
        } else {   //缓存中有
            System.out.println("从缓存中users =" + users);
        }
        return users;
    }
}
