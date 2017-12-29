package com.nippori.van.controller;

import com.nippori.van.bean.User;
import com.nippori.van.conf.SysParams;
import com.nippori.van.mapper.UserMapper;
import com.nippori.van.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
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
    private UserService userService;
    @Autowired
    private SysParams params;
    @Value("${author.name}")
    private String name;

    @RequestMapping("/{id}")
    public User view(@PathVariable("id") String id){
        System.out.println("get properties: "+params.getSysInfo());
        System.out.println("get value: "+name);
        User user = userService.getOne(id);
        return user;
    }



}
