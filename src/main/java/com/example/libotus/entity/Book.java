package com.example.libotus.entity;

import jakarta.persistence.*;
import lombok.*;

//@Data
//@RequiredArgsConstructor
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "Book")
@Getter
@ToString
@Table(name = "books")
public class Book {
    @Id
//    @SequenceGenerator(
//            name = "book_sequence",
//            sequenceName = "book_sequence",
//            allocationSize = 1
//    )
//    @GeneratedValue(strategy = GenerationType.SEQUENCE,
//            generator = "book_sequence")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false)
    private long id;
    @Column(nullable = false,
            columnDefinition = "TEXT")
    private String title;

    public Book (String title){
        this.title=title;
    }
}
