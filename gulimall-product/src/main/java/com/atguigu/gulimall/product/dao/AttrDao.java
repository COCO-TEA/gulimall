package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.AttrEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品属性
 * 
 * @author coco
 * @email coco@gmail.com
 * @date 2020-08-21 16:16:48
 */
@Mapper
public interface AttrDao extends BaseMapper<AttrEntity> {
	
}
