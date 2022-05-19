package com.kk.gulimall.order.dao;

import com.kk.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author KK
 * @email 1014180532@qq.com
 * @date 2022-05-19 11:53:47
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
