package com.example.libotus.service;

import com.example.libotus.entity.Genre;

import java.util.List;

public interface GenreService {
    Genre getById(long id);

    Genre findByTitle(String title);

    List<Genre> getAll();

    void insert(Genre genre);
}
