package com.parangluv.keybae.goods.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.validator.constraints.NotEmpty;

import com.parangluv.keybae.common.domain.CommonDomain;

import lombok.Data;

@Data
@Entity
public class Goods extends CommonDomain{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long goodsId;
	
	@Column(nullable=false)
	private Long goodsNo;
	
	@Column(nullable = false, length=80) 
	@NotEmpty
	private String title;									// 제목
	
	@Column(nullable = false, columnDefinition="TEXT") 
	@NotEmpty
	private String content;									// 내용
	
	@Column(nullable = false, length=20)
	private GCategory category;								// 카테고리
	
}