package com.example.libotus.repository;

import com.example.libotus.entity.Genre;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GenreRepository extends MongoRepository<Genre, Long> {
    List<Genre> findByTitle(String title);
}
