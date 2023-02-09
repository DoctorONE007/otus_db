package com.example.libotus.service;

import com.example.libotus.entity.Comment;

import java.util.List;

public interface CommentService {

    Comment getById(long id);

    List<Comment> findByText(String text);

    List<Comment> findByBookId(long bookId);

    List<Comment> getAll();

    void insert(Comment comment);
}
