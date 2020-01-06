package com.tiger.commodity.commodity_userservice.controller;

import com.tiger.commodity.commodity_userservice.dao.entity.TUser;
import com.tiger.commodity.commodity_utils.common.vo.BaseResponseVO;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class LoginController {

    @PostMapping("/login")
    public BaseResponseVO  login(@RequestBody @Validated TUser user)
    {
      return  new BaseResponseVO();
    }
}
