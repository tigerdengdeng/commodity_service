package com.tiger.zuul.commodity_zuul_gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableDiscoveryClient

//扫描公共工具类

public class CommodityZuulGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(CommodityZuulGatewayApplication.class, args);
	}

}
