package com.parangluv.keybae.article.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ArticleController {

	private static final Logger logger = LoggerFactory.getLogger(ArticleController.class);

	@RequestMapping("/article")
	public String debate() {
		return "main/article";
	}
	
}
