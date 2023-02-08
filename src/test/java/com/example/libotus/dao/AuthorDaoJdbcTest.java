package com.example.libotus.dao;

import com.example.libotus.entity.Author;
import com.example.libotus.service.AuthorService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@ActiveProfiles("test")
class AuthorDaoJdbcTest {

    @Autowired
    AuthorService authorDaoJdbc;

    @Test
    void getById() {
        Author author = new Author(1, "Drew");
        assertNull(authorDaoJdbc.getById(1));
        authorDaoJdbc.insert(author);
        assertEquals("Drew", authorDaoJdbc.getById(1).getName());

    }

    @Test
    void getAll() {
        Author author = new Author("Drew");
        assertEquals(0, authorDaoJdbc.getAll().size());
        authorDaoJdbc.insert(author);
        assertEquals("Drew", authorDaoJdbc.getAll().get(0).getName());
        assertEquals(1, authorDaoJdbc.getAll().size());
    }

    @Test
    void getByName() {
        Author author = new Author("Drew");
        assertNull(authorDaoJdbc.getByName("Drew"));
        authorDaoJdbc.insert(author);
        assertEquals("Drew", authorDaoJdbc.getByName("Drew").getName());
    }

    @Test
    void insert() {
        Author author = new Author("Drew");
        assertNull(authorDaoJdbc.getByName("Drew"));
        authorDaoJdbc.insert(author);
        assertEquals("Drew", authorDaoJdbc.getByName("Drew").getName());


    }
}