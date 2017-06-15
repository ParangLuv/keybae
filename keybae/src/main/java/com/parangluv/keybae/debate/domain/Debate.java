package com.parangluv.keybae.debate.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToMany;

import org.hibernate.validator.constraints.NotEmpty;

import com.mysql.jdbc.Blob;
import com.parangluv.keybae.common.domain.CommonDomain;
import com.parangluv.keybae.reply.domain.Reply;

import lombok.Data;

@Data
@Entity
public class Debate extends CommonDomain{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long debateId;
	
	@Column(nullable=false)
	private Long debateNo;
	
	@Column(nullable = false, length=20)
	private DCategory category;										// 카테고리
	
	@Lob
	@Column(nullable=true)
	private Blob repImage;											// 대표이미지
		
	@Column(nullable = false, length=80) 
	@NotEmpty
	private String title;											// 제목
	
	@Column(nullable = false, columnDefinition="TEXT") 
	@NotEmpty
	private String summary;											// 개요
	
	@Column(nullable = false, columnDefinition="TEXT") 
	@NotEmpty
	private String prosopinion;										// 찬성측 주장
	
	@Column(nullable = false, columnDefinition="TEXT") 
	@NotEmpty
	private String prosbasis;										// 찬성측 논거
	
	@Column(nullable = false, columnDefinition="TEXT") 
	@NotEmpty
	private String consopinion;										// 반대 주장
	
	@Column(nullable = false, columnDefinition="TEXT") 
	@NotEmpty
	private String consbasis;										// 반대 논거
	
	@Column(nullable = false, columnDefinition="TEXT") 
	@NotEmpty
	private String refs;											// 참고자료
	
	@Column(nullable=false, columnDefinition="int(11) default 0")
	private int vpros;												// 찬성
	
	@Column(nullable=false, columnDefinition="int(11) default 0")
	private int vcons;												// 반대
			
	@OneToMany(mappedBy="articleId", fetch = FetchType.EAGER)
	private List<Reply> replys = new ArrayList<>();					// 자식 댓글 리스트
	
	public List<Reply> getReplys() {
		if(replys==null){
			replys = new ArrayList();
		}
		return replys;
	}
	
}