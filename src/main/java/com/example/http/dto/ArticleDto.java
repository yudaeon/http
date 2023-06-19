package com.example.http.dto;

//블로그 게시글
// 게시글 - 제목
// 게시글 - 내용
/*
{
    "tltle": "제목";
    "content": "content"
    }
 */

import lombok.Data;

@Data
public class ArticleDto {
    private String title;
    private String content;
}
