package com.example.libotus.repository;

import com.example.libotus.entity.Comment;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends MongoRepository<Comment, Long> {

    List<Comment> findByText (String text);
    List<Comment> findByBookId (long bookId);
}
