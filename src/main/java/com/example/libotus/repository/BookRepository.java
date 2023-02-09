package com.example.libotus.repository;

import com.example.libotus.entity.Book;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends MongoRepository<Book, Long> {

    List<Book> findByTitle(String title);
}
