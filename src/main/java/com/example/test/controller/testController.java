package com.example.test.controller;

import com.example.user.vo.UserVo;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test/*")
public class testController {
    @RequestMapping(value ="/login")
    public String login() {
        System.out.println("Hello World!");
        return "Hello World!";
    }

    @RequestMapping(value ="/join")
    public void join() {
        System.out.println("Hello World!");
    }
}
