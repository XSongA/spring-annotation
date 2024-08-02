package com.song.service.impl;

import com.song.repository.BookDAO;
import com.song.service.BookService;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookDAO bookDAO;
}
