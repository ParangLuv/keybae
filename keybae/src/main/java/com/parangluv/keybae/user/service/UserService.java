package com.parangluv.keybae.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.parangluv.keybae.user.domain.User;
import com.parangluv.keybae.user.repository.UserRepository;

@Service
public class UserService {

	
	// Repository ~ Basic CRUD
	@Autowired
	UserRepository userRepository;
		
	public void createAndUpdateUser(User user){
		userRepository.save(user);
	}
	
	public User readUser(Long id){
		return userRepository.findOne(id);
	}
	
	public void deleteUser(User user){
		userRepository.delete(user);
	}
	// End of Repository ~ Basic CRUD
	
	
}
