package com.tiger.user.commodity_user_service;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication

@EnableDiscoveryClient
//扫描公共工具类
@ComponentScan(basePackages = {"com.tiger.*"})

//扫描mapper类
@MapperScan(basePackages = {"com.tiger.user.commodity_user_service.dao.mapper"})
public class CommodityUserServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CommodityUserServiceApplication.class, args);
    }

}
