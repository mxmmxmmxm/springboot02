package com.atguigu.dao;

import com.atguigu.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
//@Mapper
public interface UserDao {
    @Select("select * from user")
    List<User> findAll();

}
