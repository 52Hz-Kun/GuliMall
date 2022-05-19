package com.kk.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.kk.common.utils.PageUtils;
import com.kk.gulimall.product.entity.UndoLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author KK
 * @email 1014180532@qq.com
 * @date 2022-05-19 10:04:20
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

