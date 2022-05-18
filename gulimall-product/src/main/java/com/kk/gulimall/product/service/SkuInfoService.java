package com.kk.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.kk.common.utils.PageUtils;
import com.kk.gulimall.product.entity.SkuInfoEntity;

import java.util.Map;

/**
 * sku信息
 *
 * @author KK
 * @email 1014180532@qq.com
 * @date 2022-05-18 23:01:33
 */
public interface SkuInfoService extends IService<SkuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}
