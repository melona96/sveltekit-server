package com.example.board.controller;

import com.example.board.service.BoardService;
import com.example.board.vo.BoardVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/board/*")
public class BoardController {

    @Autowired
    private BoardService boardService;

    @RequestMapping(value ="/list")
    public Map<String, Object> getBoardList() {
        Map<String, Object> data = new HashMap<>();

        List<BoardVo> boardList = boardService.selectList();
        data.put("boardList", boardList);
        data.put("testKey", "");

        System.out.println(boardList);
        System.out.println(data);
        return data;
    }

    @RequestMapping(value ="/join")
    public void join() {
        System.out.println("Hello World!");
    }
}