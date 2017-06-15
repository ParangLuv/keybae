package com.parangluv.keybae.photo.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.parangluv.keybae.common.domain.CommonDomain;

import lombok.Data;

@Data
@Entity
public class Photo extends CommonDomain{

	@Id @GeneratedValue
	private Long no;
	private String id;
	private String name;

		
}
