package com.parangluv.keybae.goods.controller;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.parangluv.keybae.goods.service.GoodsService;

@Controller
@RequestMapping("/pointshop/*")
public class GoodsController {
	
	@Resource(name = "uploadPath")
	private String uploadPath;
	
	@Autowired
	private GoodsService goodsService;

	private static final Logger logger = LoggerFactory.getLogger(GoodsController.class);

	
	
}
