package com.tiger.eureka.commodity_eureka_centrality;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class CommodityEurekaCentralityApplication {

    public static void main(String[] args) {
        SpringApplication.run(CommodityEurekaCentralityApplication.class, args);
    }

}
