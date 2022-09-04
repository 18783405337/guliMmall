package com.dwh.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dwh.common.utils.PageUtils;
import com.dwh.gulimall.product.entity.CommentReplayEntity;

import java.util.Map;

/**
 * 商品评价回复关系
 *
 * @author dwh
 * @email dowoh0826@gmail.com
 * @date 2022-09-04 16:44:10
 */
public interface CommentReplayService extends IService<CommentReplayEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

