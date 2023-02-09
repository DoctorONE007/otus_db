package com.example.libotus.entity;

import lombok.Getter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Getter
public class DatabaseSequence {
    @Id
    private String id;

    private long seq;
}
