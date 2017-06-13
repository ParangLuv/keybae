package com.parangluv.keybae.goods.domain;

public enum GCategory {
	COFFEE("카페"),
	BAKERY("베이커리"),
	GIFTCARD("상품권"),
	CHICKEN("치킨"),
	PIZZA("피자"),
	HAMBURGER("햄버거");
	
	
	private String category;
	
	GCategory(String category) {
		this.category = category;
	}
}
