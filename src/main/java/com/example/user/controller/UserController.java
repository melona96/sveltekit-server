package com.example.user.controller;

import com.example.user.vo.UserVo;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/user/*")
public class UserController {
    @RequestMapping (value="/join")
    public void userJoin(@RequestBody Map<String, Object> info) {
        System.out.println(info);
        System.out.println("/api/* CORS success!");
    }
    @RequestMapping (value="/login")
    public void userLogin(@RequestBody Map<String, Object> info) {
        System.out.println(info);
        System.out.println("/api/* CORS success!");

    }


}
