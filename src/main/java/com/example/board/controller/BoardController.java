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
    public Map<String, Object> getBoardDetail(@RequestBody BoardParamVo paramVo) {
        System.out.println("paramVo: " + paramVo);

        Map<String, Object> data = new HashMap<>();

        boardService.updateHits(paramVo);

        BoardVo board = boardService.selectOne(paramVo);
        List<BoardVo> commentList = boardService.selectCommentList(paramVo);

        System.out.println(commentList);

        data.put("board", board);
        data.put("commentList", commentList);

        return data;
    }

    @RequestMapping(value ="/write")
    public int insertBoard(@RequestBody BoardVo data) {
        System.out.println(data.toString());
        return boardService.insertBoard(data);
    }

    @RequestMapping(value="/up")
    public int updateUp(@RequestBody BoardParamVo paramVo) {
        return boardService.updateUp(paramVo);
    }

    @RequestMapping(value="/comment/write")
    public int insertComment(@RequestBody BoardParamVo paramVo) {
        System.out.println("********************paramVo: " + paramVo.toString() + "******************");
        return boardService.insertComment(paramVo);
    }
}