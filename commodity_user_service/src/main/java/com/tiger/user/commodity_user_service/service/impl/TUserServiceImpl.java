package com.tiger.user.commodity_user_service.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tiger.commodity.commodity_utils.common.vo.BaseResponseVO;
import com.tiger.commodity.commodity_utils.responsecode.ResponseCode;
import com.tiger.commodity.commodity_utils.util.JwtTokenUtil;
import com.tiger.user.commodity_user_service.dao.entity.TUser;
import com.tiger.user.commodity_user_service.dao.mapper.TUserMapper;

import org.springframework.stereotype.Service;
import com.tiger.user.commodity_user_service.service.ITUserService;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author tiger
 * @since 2020-01-13
 */
@Service

public class TUserServiceImpl extends ServiceImpl<TUserMapper, TUser> implements ITUserService {
    /**
     * JWT
     */
    private JwtTokenUtil jwtTokenUtil=new JwtTokenUtil();
    /**
     * 实现 根据用户名查询用户
     *
     * @param user
     * @return
     */
    @Override
    public BaseResponseVO whereUserName(TUser user) {
        TUser tUser = baseMapper.whereUserName(user.getUsername());
        if (tUser == null) {
            return new BaseResponseVO(ResponseCode.ERROR_601.getCode().toString(), ResponseCode.ERROR_601.getMessage());
        }
        if (!tUser.getPassword().equals(user.getPassword())) {

            return new BaseResponseVO(ResponseCode.ERROR_602.getCode().toString(), ResponseCode.ERROR_602.getMessage());
        }
         String token=jwtTokenUtil.generateToken(tUser.getId().toString(),jwtTokenUtil.getRandomKey());
        return new BaseResponseVO((ResponseCode.SUCCESS_200.getCode().toString()), ResponseCode.SUCCESS_200.getMessage(),token);
    }
}
