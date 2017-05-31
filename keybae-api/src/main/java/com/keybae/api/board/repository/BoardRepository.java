package com.keybae.api.board.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.keybae.api.board.domain.Board;

public interface BoardRepository extends JpaRepository<Board, Long> {

}
