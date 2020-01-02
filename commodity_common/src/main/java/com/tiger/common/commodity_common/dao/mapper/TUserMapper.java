package com.tiger.common.commodity_common.dao.mapper;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.tiger.common.commodity_common.dao.entity.TUser;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.io.Serializable;

/**
 * <p>
 * 用户表 Mapper 接口
 * </p>
 *
 * @author tiger
 * @since 2019-12-31
 */
public interface TUserMapper extends BaseMapper<TUser> {

    TUser userById(@Param("id")int id);
}
