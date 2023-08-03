package com.example.board.service;

import com.example.board.param.BoardParamVo;
import com.example.board.repository.BoardRepository;
import com.example.board.vo.BoardVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class BoardService {

    @Autowired
    private BoardRepository boardRepository;

    public List<BoardVo> selectList(BoardParamVo paramVo) {
        return boardRepository.selectList(paramVo);
    }

    public BoardVo selectOne(BoardParamVo paramVo) {
        return boardRepository.selectOne(paramVo);
    }

    public int insertBoard(BoardVo boardVo) {
        return boardRepository.insertBoard(boardVo);
    }

    public void updateHits(BoardParamVo paramVo) {
        boardRepository.updateHits(paramVo);
    }
    public int updateUp(BoardParamVo paramVo) {
        BoardVo checkedUp = boardRepository.selectCheckUp(paramVo);
        System.out.println("********************paramVo : " + paramVo.toString() + "****************");
        System.out.println("********************checkedUp : " + checkedUp + "***************");
        if(checkedUp == null) {
            paramVo.setUp("1");
        } else {
            if (Objects.equals(checkedUp.getCheckUp(), "0")) {
                paramVo.setUp("1");
                System.out.println("*****************개추~*****************");
            }
            if (Objects.equals(checkedUp.getCheckUp(), "1")) {
                paramVo.setUp("0");
                System.out.println("*****************이미추천했음*****************");
            }
        }
        return boardRepository.updateUp(paramVo);
    }

    public int insertComment(BoardParamVo paramVo) {
        return boardRepository.insertComment(paramVo);
    }

    public List<BoardVo> selectCommentList(BoardParamVo paramVo) {
        return boardRepository.selectCommentList(paramVo);
    }
}
