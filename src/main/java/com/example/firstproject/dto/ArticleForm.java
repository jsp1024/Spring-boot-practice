package com.example.firstproject.dto;

import com.example.firstproject.entity.Article;

public class ArticleForm {

    private String title;
    private String content;

    public ArticleForm(String title, String content) {
        this.title = title;
        this.content = content;
    }

    @Override
    public String toString() {
        return "ArticleForm{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
    // dto에 있는 데이터를 entity로 변환해주는 메소드, 또한 객체를 생성하기 위해 생성자를 선언해 줌
    public Article toEntity() {
        return new Article(null,title,content);
    }
}
