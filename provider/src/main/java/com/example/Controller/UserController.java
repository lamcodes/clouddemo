package com.example.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author admin
 */
@RestController
public class UserController {
    @GetMapping("/t1")
    public String hello(){
        return "hello";
    }
}
