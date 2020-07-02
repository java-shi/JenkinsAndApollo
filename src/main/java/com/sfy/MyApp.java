package com.sfy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * @Author: Sfy
 * @Date: 2020/7/2 0002 9:21
 */
@SpringBootApplication
@MapperScan("com.sfy.mapper")
public class MyApp extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return new SpringApplicationBuilder(MyApp.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(MyApp.class);
    }
}
