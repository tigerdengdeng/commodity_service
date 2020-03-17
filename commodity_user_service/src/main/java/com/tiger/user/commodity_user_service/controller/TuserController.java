package com.tiger.user.commodity_user_service.controller;


import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.thoughtworks.xstream.mapper.Mapper;


import com.tiger.commodity.commodity_utils.common.vo.BaseResponseVO;
import com.tiger.commodity.commodity_utils.execption.GlobalExceptioHandler;
import com.tiger.user.commodity_user_service.dao.entity.TUser;
import com.tiger.user.commodity_user_service.dao.mapper.TUserMapper;
import com.tiger.user.commodity_user_service.service.ITUserService;
import com.tiger.user.commodity_user_service.service.impl.TUserServiceImpl;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.sql.Wrapper;
import java.util.List;

@RestController
@RequestMapping("/user")
@Data
@Slf4j
public class TuserController {

    @Autowired
    private TUserServiceImpl itUserService;

    @PostMapping("/login")
    public BaseResponseVO login(@RequestBody @Validated TUser user) {
        BaseResponseVO tUser = itUserService.whereUserName(user);
        return tUser;

    }

    @GetMapping("/testindex")
    public  String index(){

        return  "测试数据";
    }
}
