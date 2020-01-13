package com.tiger.user.commodity_user_service.service;

import com.tiger.commodity.commodity_utils.common.vo.BaseResponseVO;
import com.tiger.user.commodity_user_service.dao.entity.TUser;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 用户表 服务类
 * </p>
 *
 * @author tiger
 * @since 2020-01-13
 */
public interface ITUserService extends IService<TUser> {
    /**
     * 接口 根据用户名查询用户
     * @param user
     * @return
     */
    BaseResponseVO whereUserName(TUser user);

}
