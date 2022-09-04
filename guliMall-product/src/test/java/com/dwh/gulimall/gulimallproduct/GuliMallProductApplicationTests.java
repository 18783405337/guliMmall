package com.dwh.gulimall.gulimallproduct;

import com.dwh.gulimall.product.GuliMallProductApplication;
import com.dwh.gulimall.product.entity.BrandEntity;
import com.dwh.gulimall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = GuliMallProductApplication.class)
class GuliMallProductApplicationTests {


    @Autowired
    private BrandService brandService;

    @Test
    void contextLoads() {
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setDescript("teset");
        brandEntity.setName("sfdaf");
        brandService.save(brandEntity);

    }

}
