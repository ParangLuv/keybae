package com.keybae.api.article.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.keybae.api.article.domain.Article;

public interface ArticleRepository extends JpaRepository<Article, Long> {

}
