package com.song.controller;

import com.song.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller
public class BookController {
    @Autowired
    private BookService bookService;

    public void print() {
        System.out.println(bookService);
    }
}
