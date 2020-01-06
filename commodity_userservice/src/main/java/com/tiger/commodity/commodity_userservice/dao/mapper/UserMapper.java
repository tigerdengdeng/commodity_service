package com.tiger.commodity.commodity_userservice.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.tiger.commodity.commodity_userservice.dao.entity.TUser;

import java.io.Serializable;

/**
 * <p>
 * 用 Mapper 接口
 * </p>
 *
 * @author tiger
 * @since 2019-12-31
 */
public interface UserMapper extends BaseMapper<TUser> {


    TUser selectById(Serializable id);
}
