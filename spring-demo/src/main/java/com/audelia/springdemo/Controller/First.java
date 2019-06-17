package com.audelia.springdemo.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/end")


public class First {
    @GetMapping("/hello")
    public String hello(){
        return "hello world";
    }
}
