package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author coco
 * @email coco@gmail.com
 * @date 2020-08-21 16:16:48
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
