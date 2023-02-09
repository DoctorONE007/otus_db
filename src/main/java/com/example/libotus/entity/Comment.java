package com.example.libotus.entity;

import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
public class Comment {

    @Transient
    public static final String SEQUENCE_NAME = "comments_sequence";
    @Id
    private long id;
    private long bookId;
    private LocalDateTime time;
    private String text;

    public Comment(long bookId, LocalDateTime time, String text) {
        this.bookId = bookId;
        this.time = time;
        this.text = text;
    }
}
