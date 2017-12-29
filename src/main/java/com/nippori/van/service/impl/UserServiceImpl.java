package com.nippori.van.service.impl;

import com.nippori.van.bean.User;
import com.nippori.van.mapper.UserMapper;
import com.nippori.van.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserMapper userMapper;

    public User getOne(String id){
       return userMapper.getOne(id);
    }

}
