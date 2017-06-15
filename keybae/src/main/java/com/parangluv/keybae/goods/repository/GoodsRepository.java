package com.parangluv.keybae.goods.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.parangluv.keybae.goods.domain.Goods;

public interface GoodsRepository extends JpaRepository<Goods, Long> {

}
