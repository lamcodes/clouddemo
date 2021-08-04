package com.exmple.FeignClient;


import com.exmple.pojo.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;


@FeignClient(value = "order")
public interface OrderClient {

    @GetMapping("/order1")
     String o1();

    @PostMapping("/order2")
     String test1(@RequestBody User user);

    @GetMapping("/test2")
     String test2(@RequestParam("ids") String[] ids);
}
