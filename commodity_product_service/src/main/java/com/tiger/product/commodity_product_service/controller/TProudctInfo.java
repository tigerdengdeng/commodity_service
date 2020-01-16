package com.tiger.product.commodity_product_service.controller;


import lombok.Data;
import lombok.extern.slf4j.XSlf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Data
@RequestMapping("/product")
public class TProudctInfo {

  @GetMapping("/info")
    public  Object product(){

        return  1;
    }
}
