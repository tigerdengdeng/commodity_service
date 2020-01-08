package com.tiger.user.commodity_user_service.controller;


import com.tiger.commodity.commodity_utils.common.vo.BaseResponseVO;
import com.tiger.commodity.commodity_utils.error.BusinessException;
import com.tiger.user.commodity_user_service.dao.entity.TUser;
import com.tiger.user.commodity_user_service.dao.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.net.ServerSocket;

/**
 * 用户controller
 *
 * @author mytiger
 * @since  2020-01-07
 */

@RestController
@RequestMapping("/user-api")
public class UserController {
  @Autowired
  private UserMapper userMapper;
    @PostMapping("/login")
    public BaseResponseVO login(@RequestBody  @Validated TUser user){
      TUser tUser= userMapper.userById(3);
      System.out.println(tUser);
        return  new BaseResponseVO();
    }


}
