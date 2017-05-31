package com.keybae.api.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.keybae.api.user.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	
	public User findByUserName(String userName);
	
	public void deleteUserById(Long id);
}
