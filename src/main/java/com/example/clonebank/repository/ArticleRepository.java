package com.example.clonebank.repository;

import com.example.clonebank.entity.Article;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

// CrudRepository의 인자는 받을 entity와 그 entity의 대표값의 변수형을 적용한다.
public interface ArticleRepository extends CrudRepository<Article, Long> {
    @Override
    ArrayList<Article> findAll();
}
