package com.example.libotus.service;

import com.example.libotus.entity.Comment;
import com.example.libotus.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
    CommentRepository repository;

    @Override
    public Comment getById(long id) {
        return repository.findById(id).get();
    }

    @Override
    public Comment findByText(String text) {
        return repository.findByText(text);
    }

    @Override
    public Comment findByBookId(long bookId) {
        return repository.findByBookId(bookId);
    }

    @Override
    public List<Comment> getAll() {
        return repository.findAll();
    }

    @Override
    public void insert(Comment comment) {
        repository.save(comment);
    }
}
