package com.example.board.service;

import com.example.board.param.BoardParamVo;
import com.example.board.repository.BoardRepository;
import com.example.board.vo.BoardVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardService {

    @Autowired
    private BoardRepository boardRepository;

    public List<BoardVo> selectList() {
        return boardRepository.selectList();
    }

    public BoardVo selectOne(BoardParamVo paramVo) {
        return boardRepository.selectOne(paramVo);
    }

    public int insertBoard(BoardVo boardVo) {
        return boardRepository.insertBoard(boardVo);
    }
}
