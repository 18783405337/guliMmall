package com.dwh.gulimall.product.service.impl;

import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dwh.common.utils.PageUtils;
import com.dwh.common.utils.Query;

import com.dwh.gulimall.product.dao.CategoryDao;
import com.dwh.gulimall.product.entity.CategoryEntity;
import com.dwh.gulimall.product.service.CategoryService;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<CategoryEntity> getCategoryWithTree() {
        List<CategoryEntity> categoryEntities = baseMapper.selectList(null);
        //获取一级菜单数据
        List<CategoryEntity> cateLevel1 = categoryEntities.stream()
                .filter(categoryEntity -> categoryEntity.getParentCid() == 0)
                .map(menu->{
            menu.setChildren(getChildren(menu,categoryEntities));
            return menu;
        }).sorted(Comparator.comparingInt(m -> (m.getSort() == null ? 0 : m.getSort()))).collect(Collectors.toList());


        return cateLevel1;
    }

    /** 递归查找子菜单数据
     * @param root  当前菜单
     * @param all 所有菜单数据
     * @return 子菜单列表
     */
    private List<CategoryEntity> getChildren(CategoryEntity root,List<CategoryEntity> all){
        List<CategoryEntity> children = all.stream().filter(categoryEntity -> {
            return categoryEntity.getParentCid() .equals( root.getCatId());
        }).map(categoryEntity -> {
            //递归子菜单
            categoryEntity.setChildren(getChildren(categoryEntity,all));
            return categoryEntity;
            //菜单排序
        }).sorted(Comparator.comparingInt(m -> (m.getSort() == null ? 0 : m.getSort()))).collect(Collectors.toList());
        return children;
    }

}