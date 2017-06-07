package com.parangluv.keybae.reply.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.parangluv.keybae.reply.domain.Reply;
import com.parangluv.keybae.reply.repository.ReplyRepository;

@Service
public class ReplyService {

	
	// Repository ~ Basic CRUD
	@Autowired
	ReplyRepository replyRepository;
		
	public void createAndUpdateReply(Reply reply){
		replyRepository.save(reply);
	}
	
	public Reply readReply(Long id){
		return replyRepository.findOne(id);
	}
	
	public void deleteReply(Reply reply){
		replyRepository.delete(reply);
	}
	// End of Repository ~ Basic CRUD
	
	
}
