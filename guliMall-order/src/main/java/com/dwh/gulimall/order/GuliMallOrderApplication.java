package com.dwh.gulimall.order;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.dwh.gulimall.order.dao")

public class GuliMallOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(GuliMallOrderApplication.class, args);
    }

}
