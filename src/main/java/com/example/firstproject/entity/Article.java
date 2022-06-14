package com.example.firstproject.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity // DB가 해당 객체를 인식하게 함
public class Article {

    @Id // id 값은 필수로 작성해야 함
    @GeneratedValue // id 값이 1, 2, 3, ... 순대로 자동 생성해주는 어노테이션
    private Long id;

    @Column
    private String title;
    @Column
    private String content;

    public Article() {

    }
    public Article(Long id, String title, String content) {
        this.id = id;
        this.title = title;
        this.content = content;
    }



    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
