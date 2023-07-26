package com.example.board.controller;

import com.example.board.param.BoardParamVo;
import com.example.board.service.BoardService;
import com.example.board.vo.BoardVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
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

        return data;
    }

    @RequestMapping(value="/detail")
    public BoardVo getBoardDetail(@RequestBody BoardParamVo paramVo) {
        System.out.println("paramVo: " + paramVo);
        return boardService.selectOne(paramVo);
    }

    @RequestMapping(value ="/write")
    public int insertBoard(@RequestBody BoardVo data) {
        System.out.println(data.toString());
        return boardService.insertBoard(data);
    }

}