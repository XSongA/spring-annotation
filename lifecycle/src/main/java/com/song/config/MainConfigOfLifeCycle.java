package com.song.config;

import com.song.entity.Car;
import com.song.entity.Cat;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan("com.song")
public class MainConfigOfLifeCycle {
    @Bean
    public Cat cat() {
        return new Cat();
    }

    @Bean(initMethod = "init", destroyMethod = "destroy")
//    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Car car() {
        return new Car();
    }

}
