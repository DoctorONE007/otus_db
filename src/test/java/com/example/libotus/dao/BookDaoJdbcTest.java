package com.example.libotus.dao;

import com.example.libotus.entity.Book;
import com.example.libotus.service.BookService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@ActiveProfiles("test")
class BookDaoJdbcTest {

    @Autowired
    BookService bookDaoJdbc;

    @Test
    void getById() {
        Book book = new Book(1, "Drew");
        assertNull(bookDaoJdbc.getById(1));
        bookDaoJdbc.insert(book);
        assertEquals("Drew", bookDaoJdbc.getById(1).getTitle());
    }

    @Test
    void findByTitle() {
        Book book = new Book(1, "Drew");
        assertNull(bookDaoJdbc.findByTitle("Drew"));
        bookDaoJdbc.insert(book);
        assertEquals("Drew", bookDaoJdbc.findByTitle("Drew").getTitle());
    }

    @Test
    void getAll() {
        Book book = new Book(1, "Drew");
        assertEquals(0, bookDaoJdbc.getAll().size());
        bookDaoJdbc.insert(book);
        assertEquals("Drew", bookDaoJdbc.getAll().get(0).getTitle());
        assertEquals(1, bookDaoJdbc.getAll().size());
    }

    @Test
    void insert() {
        Book book = new Book(1, "Drew");
        assertEquals(0, bookDaoJdbc.getAll().size());
        bookDaoJdbc.insert(book);
        assertEquals("Drew", bookDaoJdbc.getAll().get(0).getTitle());
        assertEquals(1, bookDaoJdbc.getAll().size());
    }
}