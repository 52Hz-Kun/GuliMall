package com.kk.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.kk.common.utils.PageUtils;
import com.kk.gulimall.order.entity.UndoLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author KK
 * @email 1014180532@qq.com
 * @date 2022-05-19 11:53:47
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

