package com.exmple.controller;

import com.exmple.pojo.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/order2")
    public String test1(@RequestBody User user){
        log.info("user:{}",user);

        return "user ok  "+user.toString();
    }
    @GetMapping("/test2")
    public String test2(@RequestParam("ids") String[] ids){
        for (String i:ids
             ) {
            log.info("id为{}",i);
        }
        return "数组ok！";
    }

}
