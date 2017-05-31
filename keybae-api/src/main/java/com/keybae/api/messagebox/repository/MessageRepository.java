package com.keybae.api.messagebox.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.keybae.api.messagebox.domain.Message;

public interface MessageRepository extends JpaRepository<Message, Long> {

}
