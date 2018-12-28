package com.ar.itr.musicapi.service.impl;

import com.ar.itr.musicapi.entity.Album;
import com.ar.itr.musicapi.repository.AlbumRepository;
import com.ar.itr.musicapi.service.AlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlbumServiceImpl implements AlbumService {

    @Autowired
    private AlbumRepository albumRepository;

    @Override
    public List<Album> buscarTodo() {
        return albumRepository.findAll();
    }
}
