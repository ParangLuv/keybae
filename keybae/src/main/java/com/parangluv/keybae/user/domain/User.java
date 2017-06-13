package com.parangluv.keybae.user.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.parangluv.keybae.article.domain.Article;
import com.parangluv.keybae.common.domain.CommonDomain;
import com.parangluv.keybae.message.domain.MessageBox;
import com.parangluv.keybae.reply.domain.Reply;

import lombok.Data;

@Data
@Entity
public class User extends CommonDomain{
	
	@Id	@GeneratedValue
	private long id;										// User Key
	
	@OneToMany(mappedBy = "articleWriter")
	private List<Article> userArticles = new ArrayList<>();	// 작성한 글 리스트
	
	@OneToMany(mappedBy = "replyWriter")
	private List<Reply> userReplys = new ArrayList<>();		// 작성한 댓글 리스트
	
	@OneToOne(mappedBy = "messageBoxOwner")
	private MessageBox userMessageBox;						// 메세지 박스
	
	@Column(nullable = false, columnDefinition="int(10) default 0")
	private int points;										// 포인트
	
	
	@Column(nullable = false, length = 60)
	private String email; 									// login시 아이디
	@Column(nullable = false, length = 20)
	private String userName;								// 닉네임
	
	@JsonIgnore
	@Column(nullable = false, length = 20)
	private String password;								// 패스워드
	
//	@Transient
//	private String repeatPassword;							// 가입/정보변경시 Transient
	


	@Column(nullable = false, columnDefinition="int(2) default 0")
	private int incorrectPasswordInputNo;					// 비밀번호 틀린 횟수
	
	@Column(nullable = false, columnDefinition="bit(1) default 1")
	private boolean isAccountNonExpired;					// 계정만료여부
	
	@Column(nullable = false, columnDefinition="bit(1) default 1")
	private boolean isAccountNonLocked;					// 계정 잠김여부
	
	@Column(nullable = false, columnDefinition="bit(1) default 1")
	private boolean isEnabled;									// 계정 활성화 여부

	@Column(nullable = false, length=20)
	@Enumerated(EnumType.STRING)
	private UserAuthority userAuthority = UserAuthority.USER;	// 계정 권한타입
	

	@Temporal(TemporalType.TIMESTAMP)
	@Column(nullable = false, columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	private Date lastLoginDate;								// 최종로그인시간
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(nullable = false, columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	private Date lastChangePasswordDate;					// 최종비밀번호변경시간
	
}
