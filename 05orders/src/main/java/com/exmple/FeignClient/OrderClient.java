package com.exmple.FeignClient;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "order")
public interface OrderClient {

    @GetMapping("/order1")
     String o1();
}
