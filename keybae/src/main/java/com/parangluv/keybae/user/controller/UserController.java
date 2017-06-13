package com.parangluv.keybae.user.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

	private static final Logger logger = LoggerFactory.getLogger(UserController.class);

	@RequestMapping("/login")
	public String login() {
		return "main/login";
	}
	
	@RequestMapping("/join")
	public String join() {
		return "main/join";
	}
	
	@RequestMapping("/pointshop")
	public String pshop() {
		return "main/pshop";
	}
	
	@RequestMapping("/pointshop/goods")
	public String pshopgoods() {
		return "main/pshopgoods";
	}
	
	
}
