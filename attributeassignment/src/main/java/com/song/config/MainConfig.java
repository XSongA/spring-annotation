package com.song.config;

import com.song.entity.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

// 使用 @PropertySource 读取外部配置文件中的k-v，保存到环境变量中。
// 可以使用 @Value("${}") 取出配置文件的值
@PropertySource("classpath:/person.properties")
@Configuration
public class MainConfig {
    @Bean
    public Person person() {
        return new Person();
    }
}
