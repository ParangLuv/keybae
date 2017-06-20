package com.parangluv.keybae.photo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.parangluv.keybae.message.domain.Message;
import com.parangluv.keybae.message.repository.MessageRepository;
import com.parangluv.keybae.photo.domain.Photo;
import com.parangluv.keybae.photo.repository.PhotoRepository;

@Service
public class PhotoService {

	
	// Repository ~ Basic CRUD
	@Autowired
	PhotoRepository photoRepository;
			
	public void createAndUpdateMessage(Photo photo){
		photoRepository.save(photo);
	}
	
	public Photo readMessage(Long id){
		return photoRepository.findOne(id);
	}
	
	public void deleteMessage(Photo photo){
		photoRepository.delete(photo);
	}
	// End of Repository ~ Basic CRUD

	
}
