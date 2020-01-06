package com.tiger.commodity.commodity_userservice.controller;

import com.tiger.commodity.commodity_userservice.dao.entity.TUser;
import com.tiger.commodity.commodity_utils.common.vo.BaseResponseVO;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户Controller
 *
 * @author mytiger
 * @date 2020-01-02
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @PostMapping("/login")
    public BaseResponseVO userLogin(@RequestBody @Validated TUser user)throws  Exception {
         return  new BaseResponseVO();
    }
}
