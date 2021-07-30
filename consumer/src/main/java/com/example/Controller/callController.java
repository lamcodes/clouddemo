package com.example.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class callController {

    @Autowired
    public RestTemplate restTemplate;
    @GetMapping("/callhello")
    public String callback(){
        return restTemplate.getForObject("http://provider/t1",String.class);
    }
}
