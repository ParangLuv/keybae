package com.parangluv.keybae.message.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.parangluv.keybae.message.domain.Message;

public interface MessageRepository extends JpaRepository<Message, Long> {

}
