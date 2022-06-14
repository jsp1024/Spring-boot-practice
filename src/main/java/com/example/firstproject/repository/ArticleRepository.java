package com.example.firstproject.repository;

import com.example.firstproject.entity.Article;
import org.springframework.data.repository.CrudRepository;

// 첫 번째 파라미터에는 관리대상 Entity, 두 번재 파라미터에는 Entity의 대푯값(id)의 타입을 넣어주어야 한다.
public interface ArticleRepository extends CrudRepository<Article, Long> {

}
