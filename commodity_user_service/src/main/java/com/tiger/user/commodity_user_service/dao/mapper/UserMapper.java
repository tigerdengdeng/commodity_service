package com.tiger.user.commodity_user_service.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.tiger.user.commodity_user_service.dao.entity.TUser;
import org.apache.ibatis.annotations.Param;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.io.Serializable;

/**
 * 用户接口mapper
 *
 * @author mytiger
 * @since  2019-01-7 13:44
 */
public interface UserMapper extends BaseMapper<TUser> {

    /**
     *根据用户名查询用户
     * @param username  用户名
     * @return  返回对象
     */
    TUser userById(@Param("id")int id);

}
