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

    public List<BoardVo> selectList() {
        return boardRepository.selectList();
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
        if(checkedUp == null) {
            return boardRepository.updateUp(paramVo);
        } else {
            if(Objects.equals(checkedUp.getUp(), "0")) {
                paramVo.setUp("1");
            }
            if(Objects.equals(checkedUp.getUp(), "1")) {
                paramVo.setUp("0");
            }
            return boardRepository.updateUp(paramVo);
        }

    }
}
