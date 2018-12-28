package com.ar.itr.musicapi.repository;

import com.ar.itr.musicapi.entity.Album;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface AlbumRepository extends JpaRepository<Album, Integer> {
}
