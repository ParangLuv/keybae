package com.parangluv.keybae.board.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.parangluv.keybae.board.domain.Board;
import com.parangluv.keybae.board.repository.BoardRepository;

@Service
public class BoardService {

	
	// Repository ~ Basic CRUD
	@Autowired
	BoardRepository boardRepository;
		
	public void createAndUpdateBoard(Board board){
		boardRepository.save(board);
	}
	
	public Board readBoard(Long id){
		return boardRepository.findOne(id);
	}
	
	public void deleteBoard(Board board){
		boardRepository.delete(board);
	}
	// End of Repository ~ Basic CRUD
	
	
}
