package com.example.board.param;

import lombok.Data;

@Data
public class BoardParamVo {
    private String boardSeq;
    private String userId;
    private String up;
    private String content;
    private String pCommentSeq;
    private String lvl;

}
