package com.dwh.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dwh.common.utils.PageUtils;
import com.dwh.gulimall.product.entity.SkuInfoEntity;

import java.util.Map;

/**
 * sku信息
 *
 * @author dwh
 * @email dowoh0826@gmail.com
 * @date 2022-09-04 16:44:10
 */
public interface SkuInfoService extends IService<SkuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

