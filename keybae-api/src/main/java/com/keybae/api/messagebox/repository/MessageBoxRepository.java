package com.keybae.api.messagebox.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.keybae.api.messagebox.domain.MessageBox;

public interface MessageBoxRepository extends JpaRepository<MessageBox, Long> {

}
