package com.nippori.van;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * Created by Caesar on 2017-11-13.
 * WEB服务启动类
 */
@SpringBootApplication
@MapperScan("com.nippori.van.mapper")
public class Application{// extends SpringBootServletInitializer {

    public static void main(String[] args){
        SpringApplication.run(Application.class);
    }

//    @Override
//    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
//        return builder.sources(Application.class);
//    }

}
