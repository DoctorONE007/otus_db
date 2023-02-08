package com.example.libotus.entity;

import jakarta.persistence.*;
import lombok.*;

//@Data
//@RequiredArgsConstructor
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "Genre")
@Getter
@ToString
@Table(name = "genres")
public class Genre {
    @Id
//    @SequenceGenerator(
//            name = "genre_sequence",
//            sequenceName = "genre_sequence",
//            allocationSize = 1
//    )
//    @GeneratedValue(strategy = GenerationType.SEQUENCE,
//            generator = "genre_sequence")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false)
    private long id;
    @Column(nullable = false,
            columnDefinition = "TEXT")
    private String title;

    public Genre (String title){
        this.title=title;
    }
}
