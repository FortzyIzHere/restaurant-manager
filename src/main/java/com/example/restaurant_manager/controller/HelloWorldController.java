package com.example.restaurant_manager.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @GetMapping("/hi")
    public String helloWorld(){
        System.out.println("AICI");
        return "Hello World from Spring Boot";
    }
}
