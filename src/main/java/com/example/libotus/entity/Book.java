package com.example.libotus.entity;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.Id;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
public class Book {

    @Transient
    public static final String SEQUENCE_NAME = "books_sequence";
    @Id
    private long id;
    private String title;

    public Book(String title) {
        this.title = title;
    }
}
