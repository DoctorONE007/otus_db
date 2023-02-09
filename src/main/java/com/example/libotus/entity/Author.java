package com.example.libotus.entity;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
@Document
public class Author {
    @Transient
    public static final String SEQUENCE_NAME = "authors_sequence";
    @Id
    private long id;
    private String name;

    public Author(String name) {
        this.name = name;
    }
}
