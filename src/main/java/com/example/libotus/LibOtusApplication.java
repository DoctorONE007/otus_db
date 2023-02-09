package com.example.libotus;

//import com.example.libotus.dao.*;

import com.example.libotus.entity.Author;
import com.example.libotus.entity.Book;
import com.example.libotus.entity.Comment;
import com.example.libotus.entity.Genre;
import com.example.libotus.service.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.sql.SQLException;
import java.time.LocalDateTime;

@SpringBootApplication
public class LibOtusApplication {


    public static void main(String[] args) throws SQLException {
        ApplicationContext context = SpringApplication.run(LibOtusApplication.class);
        SequenceGeneratorService sequenceGeneratorService = context.getBean(SequenceGeneratorService.class);
//        AuthorDaoRepository authorDao = context.getBean(AuthorDaoJdbc.class);
        AuthorService authorService = context.getBean(AuthorServiceImpl.class);
        System.out.println(authorService.getAll());
        authorService.insert(new Author(sequenceGeneratorService.generateSequence(Author.SEQUENCE_NAME), "Andrey"));
        System.out.println(authorService.getByName("Andrey"));
        System.out.println(authorService.getById(1));
        System.out.println(authorService.getAll());

//        BookDaoRepository bookDao = context.getBean(BookDaoJdbc.class);
        BookService bookService = context.getBean(BookServiceImpl.class);
        System.out.println(bookService.getAll());
        bookService.insert(new Book(sequenceGeneratorService.generateSequence(Book.SEQUENCE_NAME), "AndreyBook"));
        System.out.println(bookService.findByTitle("AndreyBook"));
        System.out.println(bookService.getById(1));

//        GenreDaoRepository genreDao = context.getBean(GenreDaoJdbc.class);
        GenreService genreService = context.getBean(GenreServiceImpl.class);
        System.out.println(genreService.getAll());
        genreService.insert(new Genre(sequenceGeneratorService.generateSequence(Genre.SEQUENCE_NAME), "AndreyGenre"));
        System.out.println(genreService.findByTitle("AndreyGenre"));
        System.out.println(genreService.getById(1));

        CommentService commentService = context.getBean(CommentServiceImpl.class);
        System.out.println(commentService.getAll());
        commentService.insert(new Comment(sequenceGeneratorService.generateSequence(Comment.SEQUENCE_NAME), 1L, LocalDateTime.now(), "Большой коммент"));
        commentService.insert(new Comment(sequenceGeneratorService.generateSequence(Comment.SEQUENCE_NAME), 1L, LocalDateTime.now(), "Большой коммент 2"));
        System.out.println(commentService.findByBookId(1L));
        System.out.println(commentService.getById(1));
        System.out.println(commentService.findByText("Большой коммент 2"));
        System.out.println(commentService.getAll());


//        Console.main(args);
    }

}
