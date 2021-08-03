package com.example.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author admin
 */
@RestController
public class UserController {
    //8081

    @Autowired
    RestTemplate restTemplate;
    @GetMapping("/t2")
    public String h1(){

        return restTemplate.getForObject("http://consumer/c1",String.class);
    }
    @GetMapping("t3")
    public String h2(){
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject("http://consumer/callhello",String.class);
    }
    @GetMapping("/t1")
    public String hello(){
        return "hello";
    }
}
