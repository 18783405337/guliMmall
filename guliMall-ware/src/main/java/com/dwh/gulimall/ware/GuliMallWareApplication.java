package com.dwh.gulimall.ware;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.dwh.gulimall.ware.dao")

public class GuliMallWareApplication {

    public static void main(String[] args) {
        SpringApplication.run(GuliMallWareApplication.class, args);
    }

}
