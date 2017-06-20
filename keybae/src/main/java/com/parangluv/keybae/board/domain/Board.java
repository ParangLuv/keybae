package com.parangluv.keybae.board.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.parangluv.keybae.article.domain.Article;
import com.parangluv.keybae.common.domain.CommonDomain;

import lombok.Data;

@Data
@Entity
public class Board extends CommonDomain{
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false, length=40)
	private String boardName;											// 게시판 이름
	
	@Column(nullable = false, length=200)
	private String boardDesc;											// 게시판 설명
	
	@Column(nullable = false, length=20)
	private String boardType;											// 게시판 유형
	
	@OneToMany(mappedBy="boardId")
	private List<Article> articles = new ArrayList<>();					// 자식 게시물
	
	public List<Article> getArticle() {
		if(articles == null){
			articles = new ArrayList();
		}
		return articles;
	}
	
}
