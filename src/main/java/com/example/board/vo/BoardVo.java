package com.example.board.vo;

import lombok.Data;

@Data
public class BoardVo {
    private String boardSeq;
    private String title;
    private String content;
    private String inputDt;
    private String inputId;
    private String updtDt;
    private String updtId;
    private String useYn;
    private String hits;
    private String up;
    private String down;
    private String categoryCd;
    private String categoryNm;
    private String categoryNmEn;
    private String checkUp;

    // dc_comment
    private String commentSeq;

}
