package com.song.test;

import com.song.config.BookConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BookTest {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(BookConfig.class);
        String[] definitionNames = context.getBeanDefinitionNames();
        for (String name : definitionNames) {
            System.out.println(name);
        }
    }
}
