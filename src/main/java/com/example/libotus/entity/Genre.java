package com.example.libotus.entity;

import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
public class Genre {

    @Transient
    public static final String SEQUENCE_NAME = "genres_sequence";
    @Id
    private long id;
    private String title;

    public Genre(String title) {
        this.title = title;
    }
}
