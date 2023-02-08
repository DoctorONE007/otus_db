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
import java.sql.Timestamp;

@SpringBootApplication
public class LibOtusApplication {

    public static void main(String[] args) throws SQLException {
        ApplicationContext context = SpringApplication.run(LibOtusApplication.class);
////        AuthorDaoRepository authorDao = context.getBean(AuthorDaoJdbc.class);
//        AuthorService authorService = context.getBean(AuthorServiceImpl.class);
//        System.out.println(authorService.getAll());
//        authorService.insert(new Author("Andrey"));
//        System.out.println(authorService.getByName("Andrey"));
//        System.out.println(authorService.getById(1));
//        System.out.println(authorService.getAll());
//
////        BookDaoRepository bookDao = context.getBean(BookDaoJdbc.class);
//        BookService bookService = context.getBean(BookServiceImpl.class);
//        System.out.println(bookService.getAll());
//        bookService.insert(new Book("AndreyBook"));
//        System.out.println(bookService.findByTitle("AndreyBook"));
//        System.out.println(bookService.getById(4));
//
////        GenreDaoRepository genreDao = context.getBean(GenreDaoJdbc.class);
//        GenreService genreService = context.getBean(GenreServiceImpl.class);
//        System.out.println(genreService.getAll());
//        genreService.insert(new Genre("AndreyGenre"));
//        System.out.println(genreService.findByTitle("AndreyGenre"));
//        System.out.println(genreService.getById(4));

        CommentService commentService = context.getBean(CommentServiceImpl.class);
        System.out.println(commentService.getAll());
        commentService.insert(new Comment(1L,new Timestamp(System.currentTimeMillis()),"Большой коммент"));
        commentService.insert(new Comment(1L,new Timestamp(System.currentTimeMillis()),"Большой коммент 2"));
//        System.out.println(commentService.findByBookId(1L));
        System.out.println(commentService.getById(1));
        System.out.println(commentService.findByText("Большой коммент"));
        System.out.println(commentService.getAll());


//        Console.main(args);
    }
}
