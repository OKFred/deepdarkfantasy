package com.nippori.van.controller;

import com.nippori.van.bean.User;
import com.nippori.van.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Caesar on 2017-11-13.
 */

@RestController
@RequestMapping("/user")
public class UserEntryController {
    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/{id}")
    public User view(@PathVariable("id") String id){
        //添加一行注释，看github是否及时更新
        User user = userMapper.getOne(id);
        return user;
    }
}
