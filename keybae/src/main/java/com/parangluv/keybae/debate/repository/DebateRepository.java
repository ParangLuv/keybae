package com.parangluv.keybae.debate.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.parangluv.keybae.debate.domain.Debate;

public interface DebateRepository extends JpaRepository<Debate, Long> {

}
