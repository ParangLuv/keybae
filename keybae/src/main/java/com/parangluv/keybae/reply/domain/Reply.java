package com.parangluv.keybae.reply.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.parangluv.keybae.article.domain.Article;
import com.parangluv.keybae.common.domain.CommonDomain;
import com.parangluv.keybae.user.domain.User;

import lombok.Data;

@Data
@Entity
public class Reply extends CommonDomain{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long replyId;
	
	@Column(nullable=false)
	private Long replyNo;

	@ManyToOne
	@JoinColumn(name="replyWriter", foreignKey = @ForeignKey(name="replyWriter"), nullable = false)
	private User replyWriter;										// 작성자
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="article_id", foreignKey = @ForeignKey(name="article_id"), nullable = false)
	private Article articleId;										// 부모 게시물
		
	@Column(nullable=false, columnDefinition="TEXT")
	private String content;											// 내용
	
	@Column(nullable = true)
	private long parentReply;										// 부모댓글
	
	@Column(nullable = false, columnDefinition="bit(1) default 0")
	private boolean indent;											// 들여쓰기 

}
