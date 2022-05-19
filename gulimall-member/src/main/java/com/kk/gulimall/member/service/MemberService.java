package com.kk.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.kk.common.utils.PageUtils;
import com.kk.gulimall.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author KK
 * @email 1014180532@qq.com
 * @date 2022-05-19 11:21:32
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

