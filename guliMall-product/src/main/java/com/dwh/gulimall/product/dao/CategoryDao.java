package com.dwh.gulimall.product.dao;

import com.dwh.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author dwh
 * @email dowoh0826@gmail.com
 * @date 2022-09-04 16:44:10
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
