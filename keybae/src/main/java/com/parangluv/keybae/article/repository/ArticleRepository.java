package com.parangluv.keybae.article.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.parangluv.keybae.article.domain.Article;

public interface ArticleRepository extends JpaRepository<Article, Long> {

}
