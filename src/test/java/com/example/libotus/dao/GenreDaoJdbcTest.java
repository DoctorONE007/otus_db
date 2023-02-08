package com.example.libotus.dao;

import com.example.libotus.entity.Genre;
import com.example.libotus.service.GenreService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
@ActiveProfiles("test")
class GenreDaoJdbcTest {

    @Autowired
    GenreService genreDaoJdbc;

    @Test
    void getById() {
        Genre genre = new Genre(1, "Drew");
        assertNull(genreDaoJdbc.getById(1));
        genreDaoJdbc.insert(genre);
        assertEquals("Drew", genreDaoJdbc.getById(1).getTitle());
    }

    @Test
    void findByTitle() {
        Genre genre = new Genre(1, "Drew");
        assertNull(genreDaoJdbc.findByTitle("Drew"));
        genreDaoJdbc.insert(genre);
        assertEquals("Drew", genreDaoJdbc.findByTitle("Drew").getTitle());
    }

    @Test
    void getAll() {
        Genre genre = new Genre(1, "Drew");
        assertEquals(0, genreDaoJdbc.getAll().size());
        genreDaoJdbc.insert(genre);
        assertEquals("Drew", genreDaoJdbc.getAll().get(0).getTitle());
        assertEquals(1, genreDaoJdbc.getAll().size());
    }

    @Test
    void insert() {
        Genre genre = new Genre(1, "Drew");
        assertEquals(0, genreDaoJdbc.getAll().size());
        genreDaoJdbc.insert(genre);
        assertEquals("Drew", genreDaoJdbc.getAll().get(0).getTitle());
        assertEquals(1, genreDaoJdbc.getAll().size());
    }
}