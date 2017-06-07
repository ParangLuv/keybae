package com.parangluv.keybae.board.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.parangluv.keybae.board.domain.Board;

public interface BoardRepository extends JpaRepository<Board, Long> {

}
