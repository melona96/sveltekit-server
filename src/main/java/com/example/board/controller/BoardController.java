package com.example.board.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/board/*")
public class BoardController {
    @RequestMapping(value ="/list")
    public Map<String, Object> getBoardList() {
        Map<String, Object> data = new HashMap<>();
        data.put("data", "test입니다.");
        System.out.println(data);
        return data;
    }

    @RequestMapping(value ="/join")
    public void join() {
        System.out.println("Hello World!");
    }
}