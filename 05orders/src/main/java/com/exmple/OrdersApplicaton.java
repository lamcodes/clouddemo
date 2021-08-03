package com.exmple;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;


/**
 * @author admin
 */
@EnableFeignClients//开启feign客户端调用
@EnableDiscoveryClient//开启服务注册
@SpringBootApplication

public class OrdersApplicaton {
    public static void main(String[] args) {
        SpringApplication.run(OrdersApplicaton.class,args);
    }
}
