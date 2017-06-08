package com.parangluv.keybae.debate.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.hibernate.validator.constraints.NotEmpty;

import com.parangluv.keybae.board.domain.Board;
import com.parangluv.keybae.common.domain.CommonDomain;
import com.parangluv.keybae.reply.domain.Reply;
import com.parangluv.keybae.user.domain.User;

import lombok.Data;

@Data
@Entity
public class Debate extends CommonDomain{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long articleId;
	
	@Column(nullable=false)
	private Long debateNo;
		
	@OneToMany(mappedBy="articleId", fetch = FetchType.EAGER)
	private List<Reply> replys = new ArrayList<>();					// 자식 댓글 리스트
	
	public List<Reply> getReplys() {
		if(replys==null){
			replys = new ArrayList();
		}
		return replys;
	}
	
	@Column(nullable = false, length=80) 
	@NotEmpty
	private String title;									// 제목
	
	@Column(nullable = false, columnDefinition="TEXT") 
	@NotEmpty
	private String content;									// 내용
	
	@Column(nullable = false, length=20)
	private DCategory category;								// 카테고리
	
}