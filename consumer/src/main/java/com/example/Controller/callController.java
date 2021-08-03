package com.example.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author admin
 */
@RestController
public class callController {
//8082
    @Autowired
    public RestTemplate restTemplate;

    @GetMapping("/c1")
    public String c1(){
        return "ceshi";
    }
    @GetMapping("/callhello")
    public String callback(){
        return restTemplate.getForObject("http://provider/t1",String.class);
    }
}
