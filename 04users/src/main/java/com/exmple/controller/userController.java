package com.exmple.controller;

import com.exmple.FeignClient.OrderClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author admin
 */
@RestController
public class userController {
    private static final Logger log = LoggerFactory.getLogger(userController.class);

    @Autowired
    private OrderClient orderClient;

    @Value("${server.port}")
    private int port;
    @GetMapping("/u1")
    public String get(){
        log.info("进入商品服务");
        String s = orderClient.o1();

        return "user ok! ,当前端口为   "+s;
    }
}
