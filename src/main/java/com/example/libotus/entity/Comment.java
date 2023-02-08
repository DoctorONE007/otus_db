package com.example.libotus.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.sql.Timestamp;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Entity(name = "Comment")
@ToString
@Table(name = "comments")
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false)
    private long id;

    private long bookId;

    private Timestamp time;
    @Column(nullable = false,
            columnDefinition = "TEXT")
    private String text;

    public Comment (long bookId, Timestamp time, String text){
        this.bookId = bookId;
        this.time=time;
        this.text=text;
    }
}
