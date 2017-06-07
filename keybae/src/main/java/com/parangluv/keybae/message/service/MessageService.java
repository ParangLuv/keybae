package com.parangluv.keybae.message.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.parangluv.keybae.message.domain.Message;
import com.parangluv.keybae.message.repository.MessageRepository;

@Service
public class MessageService {

	
	// Repository ~ Basic CRUD
	@Autowired
	MessageRepository messageRepository;
		
	public void createAndUpdateMessage(Message message){
		messageRepository.save(message);
	}
	
	public Message readMessage(Long id){
		return messageRepository.findOne(id);
	}
	
	public void deleteMessage(Message message){
		messageRepository.delete(message);
	}
	// End of Repository ~ Basic CRUD
	
	
}
