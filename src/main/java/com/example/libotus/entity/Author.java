package com.example.libotus.entity;

import jakarta.persistence.*;
import lombok.*;

//@Data
//@RequiredArgsConstructor
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Entity(name = "Author")
@ToString
@Table(name = "authors")
public class Author {
    @Id
//    @SequenceGenerator(
//            name = "author_sequence",
//            sequenceName = "author_sequence",
//            allocationSize = 1
//    )
//    @GeneratedValue(strategy = GenerationType.SEQUENCE,
//            generator = "author_sequence")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false)
    private long id;
    @Column(nullable = false,
            columnDefinition = "TEXT")
    private String name;

    public Author (String name){
        this.name = name;
    }
}
