package com.atguigu.dao;

import com.atguigu.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;


//DAO继承JpaRepository接口，接口中就已经含有基本CRUD操作了
public interface UserDao extends JpaRepository<User, Integer> {

}
