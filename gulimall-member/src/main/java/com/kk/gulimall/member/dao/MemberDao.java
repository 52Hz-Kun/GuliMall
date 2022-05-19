package com.kk.gulimall.member.dao;

import com.kk.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author KK
 * @email 1014180532@qq.com
 * @date 2022-05-19 11:21:32
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
