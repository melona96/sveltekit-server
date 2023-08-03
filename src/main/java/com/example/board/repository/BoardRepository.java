package com.example.board.repository;

import com.example.board.param.BoardParamVo;
import com.example.board.vo.BoardVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardRepository {
    List<BoardVo> selectList(BoardParamVo paramVo);
    BoardVo selectOne(BoardParamVo paramVo);
    int insertBoard(BoardVo boardVo);
    void updateHits(BoardParamVo paramVo);
    BoardVo selectCheckUp(BoardParamVo paramVo);
    int updateUp(BoardParamVo paramVo);
    List<BoardVo> selectCommentList(BoardParamVo paramVo);
    int insertComment(BoardParamVo boardParamVo);
}
