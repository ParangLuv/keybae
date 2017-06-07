package com.parangluv.keybae.debate.domain;

public enum DCategory {
	POLITICS("정치"),
	SOCIETY("사회"),
	HISTORY("역사"),
	PHILOSOPHY("철학"),
	MEDICINE("의학");
	
	
	private String category;
	
	DCategory(String category) {
		this.category = category;
	}
}
