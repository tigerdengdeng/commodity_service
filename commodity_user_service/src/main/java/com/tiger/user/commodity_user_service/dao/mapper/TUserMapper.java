package com.tiger.user.commodity_user_service.dao.mapper;

import com.tiger.user.commodity_user_service.dao.entity.TUser;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 * 用户表 Mapper 接口
 * </p>
 *
 * @author tiger
 * @since 2020-01-13
 */
public interface TUserMapper extends BaseMapper<TUser> {
    /**
     * 根据条件查询用户
     *
     * @param username
     * @return
     */
    TUser whereUserName(@Param("username") String username);
}
