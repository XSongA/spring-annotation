package com.song.config;

import com.song.controller.BookController;
import com.song.repository.BookDAO;
import com.song.service.BookService;
//import com.song.service.impl.BookServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 * 自动装配：
 */
@Configuration
@ComponentScan({"com.song.controller",
        "com.song.service",
        "com.song.repository",
        "com.song.entity"})
public class MainConfig {
    @Primary
    @Bean("bookDAO2")
    public BookDAO bookDAO() {
        BookDAO bookDAO = new BookDAO();
        bookDAO.setLabel("2");
        return bookDAO;
    }
}
