package com.parangluv.keybae.message.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.parangluv.keybae.common.domain.CommonDomain;
import com.parangluv.keybae.user.domain.User;

import lombok.Data;

@Data
@Entity
public class MessageBox extends CommonDomain{
	@Id	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;											// 메세지 박스 KEY
	
	@OneToOne
	@JoinColumn(name="MessageBoxOwner", nullable = false, foreignKey = @ForeignKey(name="user"))
	private User messageBoxOwner;								// 메세지 박스 주인(수신자)
	
	@OneToMany(mappedBy="parentMessageBox")
	private List<Message> childMessages = new ArrayList<>();	// 자식 메세지들
}
