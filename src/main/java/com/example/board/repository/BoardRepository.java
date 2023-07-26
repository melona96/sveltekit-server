package com.example.board.repository;

import com.example.board.vo.BoardVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardRepository {
    List<BoardVo> selectList();
    int insertBoard(BoardVo boardVo);
}
