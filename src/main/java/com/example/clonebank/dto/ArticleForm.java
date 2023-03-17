package com.example.clonebank.dto;

import com.example.clonebank.entity.Article;
import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
// form 데이터를 컨트롤러로 받아오는 객체 dto
public class ArticleForm {

    private Long id;
    private String title;
    private String content;
    // 말 그대로 entity에게 정보 전달을 위한 메소드
    public Article toEntity() {
        return new Article(id, title, content);
    }
}
