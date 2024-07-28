package com.song.config;

import com.song.filter.MyTypeFilter;
import com.song.repository.BookDAO;
import com.song.service.BookService;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Configuration
//@ComponentScan(value = "com.song")
@ComponentScan(
        value = "com.song",
        // 禁用默认规则，此时 includeFilters 才生效
        useDefaultFilters = false,
        // 排除哪些组件
//        excludeFilters = {
//                @ComponentScan.Filter(type = FilterType.ANNOTATION,
//                        classes = {Controller.class})},
        // 只包含哪些组件
        includeFilters = {
                // FilterType.ANNOTATION：按照注解
                // FilterType.ASSIGNABLE_TYPE：按照给定的类型
                // FilterType.ASPECTJ：按照 ASPECTJ 表达式
                // FilterType.REGEX：按照正则表达式
                // FilterType.CUSTOM：使用自定义规则
//                @ComponentScan.Filter(type = FilterType.ANNOTATION,
//                        classes = {Repository.class}
//                ),
//                @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE,
//                        classes = {BookService.class}
//                ),
                @ComponentScan.Filter(type = FilterType.CUSTOM,
                        classes = {MyTypeFilter.class}
                )}
)
// @ComponentScan 是可重复的
//@ComponentScan(value = "com.song")
// @ComponentScans 中可以写多个 @ComponentScan
//@ComponentScans(value = {
//        @ComponentScan(
//                value = "com.song",
//                // 禁用默认规则，此时 includeFilters 才生效
//                useDefaultFilters = false,
//                // 排除哪些组件
//                excludeFilters = {
//                        @ComponentScan.Filter(type = FilterType.ANNOTATION,
//                                classes = {Controller.class})},
//                // 只包含哪些组件
//                includeFilters = {
//                        @ComponentScan.Filter(type = FilterType.ANNOTATION,
//                                classes = {Service.class}
//                        )}
//        )
//})
public class MainConfig {
}
