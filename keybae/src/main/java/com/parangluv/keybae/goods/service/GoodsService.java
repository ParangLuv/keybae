package com.parangluv.keybae.goods.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.parangluv.keybae.debate.domain.Debate;
import com.parangluv.keybae.debate.repository.DebateRepository;
import com.parangluv.keybae.goods.domain.Goods;
import com.parangluv.keybae.goods.repository.GoodsRepository;

@Service
public class GoodsService {

	
	// Repository ~ Basic CRUD
	@Autowired
	GoodsRepository goodsRepository;
		
	public void createAndUpdateGoods(Goods goods){
		goodsRepository.save(goods);
	}
	
	public Goods readGoods(Long id){
		return goodsRepository.findOne(id);
	}
	
	public void deleteGoods(Goods goods){
		goodsRepository.delete(goods);
	}
	// End of Repository ~ Basic CRUD
	
	
}
