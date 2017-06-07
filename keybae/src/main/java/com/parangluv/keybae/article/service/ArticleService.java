package com.parangluv.keybae.article.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.parangluv.keybae.article.domain.Article;
import com.parangluv.keybae.article.repository.ArticleRepository;

@Service
public class ArticleService {

	
	// Repository ~ Basic CRUD
	@Autowired
	ArticleRepository articleRepository;
		
	public void createAndUpdateArticle(Article article){
		articleRepository.save(article);
	}
	
	public Article readArticle(Long id){
		return articleRepository.findOne(id);
	}
	
	public void deleteArticle(Article article){
		articleRepository.delete(article);
	}
	// End of Repository ~ Basic CRUD
	
	
}
