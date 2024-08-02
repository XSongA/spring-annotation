package com.song.entity;

import lombok.*;
import org.springframework.beans.factory.annotation.Value;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Person {
    /**
     * 基本数值
     */
    @Value("zs")
    private String name;

    /**
     * SpEL表达式
     */
    @Value("#{22-2}")
    private Integer age;

    /**
     * 从环境变量中取值
     */
    @Value("${os.name}")
    private String osName;

    /**
     * 从环境变量（配置文件）中取值
     */
    @Value("${person.country}")
    private String country;
}
