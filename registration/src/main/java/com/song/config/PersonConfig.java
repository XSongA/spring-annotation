package com.song.config;

import com.song.entity.Person;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class PersonConfig {
    /**
     * 类型为返回值类型
     * id为方法名（默认）/指定id
     *
     * @return bean
     */
    // singleton：单实例（默认值）。ioc容器启动时调用方法创建对象放到ioc容器中，以后每次从容器中取
    // prototype：多实例。ioc容器启动时不创建，每次获取的时候调用方法创建
    // request：同一个请求
    // session：同一个session
    @Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    @Bean("person01")
    public Person person() {
        System.out.println("person...");
        return new Person("ls", 20);
    }
}
