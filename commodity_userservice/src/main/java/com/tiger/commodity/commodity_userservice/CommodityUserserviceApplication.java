package com.tiger.commodity.commodity_userservice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//扫描公共工具类
@ComponentScan(basePackages = {"com.tiger.commodity.commodity_utils"})
//扫描mapper类
@MapperScan(basePackages = {"com.tiger.commodity.commodity_userservice.dao.mapper"})
public class CommodityUserserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CommodityUserserviceApplication.class, args);
	}

}
