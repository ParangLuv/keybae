package com.parangluv.keybae.photo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.parangluv.keybae.photo.domain.Photo;

public interface PhotoRepository extends JpaRepository<Photo, Long> {

}
