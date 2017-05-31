package com.keybae.api.reply.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.keybae.api.reply.domain.Reply;

public interface ReplyRepository extends JpaRepository<Reply, Long> {

}
