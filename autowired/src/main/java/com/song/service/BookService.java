package com.song.service;

import com.song.repository.BookDAO;
import jakarta.inject.Inject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class BookService {
    // 这里使用 @Qualifier 指明要注入的组件id为 bookDAO，而不是属性名 bookDAO2
//    @Qualifier("bookDAO")
//    @Autowired(required = false)
//    @Resource(name = "bookDAO2")
    @Inject
    private BookDAO bookDAO;

    public void print() {
        System.out.println(bookDAO);
    }
}
