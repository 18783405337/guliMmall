package com.dwh.gulimall.coupon;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.dwh.gulimall.coupon.dao")
public class GuliMallCouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(GuliMallCouponApplication.class, args);
    }

}
