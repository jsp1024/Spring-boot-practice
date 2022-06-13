package com.example.firstproject.controller;


import com.example.firstproject.dto.ArticleForm;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ArticleController {
    @GetMapping("/articles/new")
    public String newArticleForm(){
        return "articles/new";
    }

    // view에서 만든 폼 태그의 정보를 PostMapping의 url 주소로 받는다.
    @PostMapping("/articles/create")
    // 그렇게 받아온 데이터는 dto객체에 받아오게 된다.
    public String createArticle(ArticleForm form){
        System.out.println(form.toString());
        return "";
    }
}
