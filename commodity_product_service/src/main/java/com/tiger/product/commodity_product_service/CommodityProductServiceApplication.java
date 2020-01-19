package com.tiger.product.commodity_product_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CommodityProductServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CommodityProductServiceApplication.class, args);
	}

}
