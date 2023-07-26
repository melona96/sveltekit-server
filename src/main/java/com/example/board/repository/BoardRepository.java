package com.example.board.repository;

import com.example.board.param.BoardParamVo;
import com.example.board.vo.BoardVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardRepository {
    List<BoardVo> selectList();
    BoardVo selectOne(BoardParamVo paramVo);
    int insertBoard(BoardVo boardVo);
}
