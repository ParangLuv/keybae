package com.parangluv.keybae.debate.controller;

import java.io.File;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import com.parangluv.keybae.debate.domain.DCategory;
import com.parangluv.keybae.debate.domain.Debate;
import com.parangluv.keybae.debate.service.DebateService;

@Controller
@RequestMapping("/debate/*")
public class DebateController {
	
	@Resource(name = "uploadPath")
	private String uploadPath;
	
	@Autowired
	private DebateService debateService;

	private static final Logger logger = LoggerFactory.getLogger(DebateController.class);

	
	@RequestMapping(value = "/read", method = RequestMethod.GET)
	public String debate(Model model, Long id) {
//		Debate debate = debateService.readDebate(id);
		return "main/debate";
	}
	
	
	
	@RequestMapping(value = "/new", method = RequestMethod.GET)
	public String newDebate() {
		return "main/newdebate";
	}
	
	@RequestMapping(value = "/new", method = RequestMethod.POST)
	public String newDebatePost(@ModelAttribute Debate debate, Model model, MultipartFile refImage) {
		System.out.println(debate.toString());
		
		debate.setDebateId(1L);
		debate.setCategory(DCategory.HISTORY);
		debate.setDebateNo(1L);
		
		File upload = new File(uploadPath);
		if (!upload.isDirectory()) {
			upload.mkdirs();
		}
		
		
		
		logger.info(debate.toString());
		debateService.createAndUpdateDebate(debate);
		return "redirect:/debate/read";
	}
	
	
	
	@RequestMapping(value = "/mod", method = RequestMethod.GET)
	public String modDebate(Model model, Long id) {
		Debate debate = debateService.readDebate(id);
		return "main/debate";
	}
	
	@RequestMapping(value = "/mod", method = RequestMethod.POST)
	public String modDebatePost(Model model, Long id) {
		Debate debate = debateService.readDebate(id);
		return "main/debate";
	}
	
	@RequestMapping(value = "/del", method = RequestMethod.POST)
	public String delDebate(Model model, Long id) {
		Debate debate = debateService.readDebate(id);
		return "main/debate";
	}
	
}
