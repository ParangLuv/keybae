package com.parangluv.keybae.debate.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.parangluv.keybae.debate.domain.Debate;
import com.parangluv.keybae.debate.repository.DebateRepository;

@Service
public class DebateService {

	
	// Repository ~ Basic CRUD
	@Autowired
	DebateRepository debateRepository;
		
	public void createAndUpdateDebate(Debate debate){
		debateRepository.save(debate);
	}
	
	public Debate readDebate(Long id){
		return debateRepository.findOne(id);
	}
	
	public void deleteDebate(Debate debate){
		debateRepository.delete(debate);
	}
	// End of Repository ~ Basic CRUD
	
	
}
