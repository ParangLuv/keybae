package com.parangluv.keybae.photo.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.parangluv.keybae.common.domain.CommonDomain;

import lombok.Data;

@Data
@Entity
public class Photo extends CommonDomain{

	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String userNickname;
	private String originName;
	
	public Photo(String originName) {
		this.originName = originName;
	}

	
	
}
