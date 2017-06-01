package com.parangluv.keybae.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.parangluv.keybae.user.domain.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
