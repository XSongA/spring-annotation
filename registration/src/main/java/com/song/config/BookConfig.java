package com.song.config;

import com.song.filter.MyTypeFilter;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

//@Configuration
// FilterType:ANNOTATION、ASSIGNABLE_TYPE、ASPECTJ、REGEX、CUSTOM
//@ComponentScan(value = "com.song",
//        includeFilters = {
////        @ComponentScan.Filter(type = FilterType.ANNOTATION, value = {Controller.class}),
////        @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, value = BookService.class),
//                @ComponentScan.Filter(type = FilterType.CUSTOM, classes = {MyTypeFilter.class})
//        },
//        useDefaultFilters = false)
//@ComponentScan(value = "com.song")
public class BookConfig {
}
