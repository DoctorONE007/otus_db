package com.example.libotus.service;

import com.example.libotus.entity.Book;
import com.example.libotus.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BookServiceImpl implements BookService{
    @Autowired
    BookRepository repository;

    @Override
    public Book getById(long id) {
        return repository.findById(id).get();
    }

    @Override
    public  List<Book> findByTitle(String title) {
        return repository.findByTitle(title);
    }

    @Override
    public List<Book> getAll() {
        return repository.findAll();
    }

    @Override
    public void insert(Book book) {
        repository.save(book);
    }
}
