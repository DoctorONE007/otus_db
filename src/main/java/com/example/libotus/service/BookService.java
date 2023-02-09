package com.example.libotus.service;

import com.example.libotus.entity.Book;

import java.util.List;

public interface BookService {
    Book getById(long id);

    List<Book> findByTitle(String title);

    List<Book> getAll();

    void insert(Book book);
}
