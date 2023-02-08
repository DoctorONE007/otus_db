package com.example.libotus.repository;

import com.example.libotus.entity.Book;
import com.example.libotus.entity.Genre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GenreRepository extends JpaRepository<Genre, Long> {
    Genre findByTitle(String title);
}
