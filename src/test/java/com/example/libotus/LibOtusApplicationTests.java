package com.example.libotus;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("test")
class LibOtusApplicationTests {

    @Autowired
    ApplicationContext context;
    @Test
    void contextLoads() {
//        AuthorDaoRepository authorDao = context.getBean(AuthorDaoJdbc.class);
//        System.out.println(authorDao.getAll());
    }

}
