package com.example.libotus.repository;

import com.example.libotus.entity.Author;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AuthorRepository extends MongoRepository<Author,Long> {

    List<Author> findByName(String name);
}
