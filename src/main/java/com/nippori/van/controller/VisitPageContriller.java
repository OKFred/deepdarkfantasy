package com.nippori.van.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Caesar
 * on 2017-11-16.
 */
@Controller
@RequestMapping("/")
public class VisitPageContriller {

    @RequestMapping("")
    public String welcomePage(){
        System.out.println("访问经过了分发...");
        return "index";
    }
}
