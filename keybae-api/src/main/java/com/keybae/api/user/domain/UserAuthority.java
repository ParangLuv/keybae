package com.keybae.api.user.domain;

public enum UserAuthority {
	ADMIN("관리자"),
	USER("유저");
	
	
	private String auth;
	
	UserAuthority(String auth) {
		this.auth = auth;
	}

	public String getAuth() {
		return auth;
	}
	
	
	
}
