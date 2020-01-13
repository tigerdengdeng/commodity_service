package com.tiger.user.commodity_user_service.controller;


import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.thoughtworks.xstream.mapper.Mapper;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.sql.Wrapper;
import java.util.List;

@RestController
@RequestMapping("/user")
public class TuserController {

    @GetMapping("/login")
    public int login(){



        return   1;

    }
}
