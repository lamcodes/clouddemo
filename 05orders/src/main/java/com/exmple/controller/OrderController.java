package com.exmple.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    private static final Logger log = LoggerFactory.getLogger(OrderController.class);


    @Value("${server.port}")//8882
    private int port;
    @GetMapping("/order1")
    public String o1(){
        log.info("进入order服务");
        return "order ok :"+port;
    }

}
