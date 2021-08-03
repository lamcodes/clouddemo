package com.exmple.feignClient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author admin
 */
//调用商品服务接口
@FeignClient(value = "user")//value:用来书写调用服务的服务id
public interface UserClient {

    @GetMapping("/u1")
     String get();
}
