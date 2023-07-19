package com.example.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.RequestScope;

@RestController
@RequestMapping("/test/*")
public class testController {
    @RequestMapping(value ="/login")
    public String home() {
        System.out.println("Hello World!");
        return "Hello World!";
    }
}
