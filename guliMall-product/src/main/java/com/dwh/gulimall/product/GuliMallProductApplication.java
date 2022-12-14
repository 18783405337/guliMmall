package com.dwh.gulimall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.dwh.gulimall.product.dao")
public class GuliMallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(GuliMallProductApplication.class, args);
    }

}
