package com.dwh.gulimall.member.feign;

import com.dwh.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("guliMall-coupon-8000")
public interface CouponFeignService {
    @RequestMapping("coupon/smscoupon/member/list")
    public R memberCoupons();
}
