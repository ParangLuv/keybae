package com.parangluv.keybae.debate.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DebateController {

	private static final Logger logger = LoggerFactory.getLogger(DebateController.class);

	@RequestMapping("/debate")
	public String home() {
		System.out.println("HomeController");
		return "main/debate";
	}
	
}
