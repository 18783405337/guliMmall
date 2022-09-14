package com.dwh.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dwh.common.utils.PageUtils;
import com.dwh.gulimall.product.entity.CategoryEntity;

import java.util.List;
import java.util.Map;

/**
 * 商品三级分类
 *
 * @author dwh
 * @email dowoh0826@gmail.com
 * @date 2022-09-04 16:44:10
 */
public interface CategoryService extends IService<CategoryEntity> {

    PageUtils queryPage(Map<String, Object> params);

    /**获取商品分类（树形结构）
     * @return 树形数据
     */
    List<CategoryEntity> getCategoryWithTree();
}

