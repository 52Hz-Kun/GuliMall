package com.kk.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.kk.common.utils.PageUtils;
import com.kk.gulimall.member.entity.UndoLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author KK
 * @email 1014180532@qq.com
 * @date 2022-05-19 11:21:31
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

