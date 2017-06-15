package com.parangluv.keybae.article.domain;

public enum ACategory {
	NOTICE("공지사항"),
	QNA("문의"),
	FREE("자유"),
	NEWS("뉴스"),
	ETC("기타");
	
	
	private String category;
	
	ACategory(String category) {
		this.category = category;
	}
}
