package com.tiger.configservice.commodity_config_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableDiscoveryClient //服务提供者
@EnableConfigServer  //配置中心
public class CommodityConfigServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CommodityConfigServiceApplication.class, args);
	}

}
