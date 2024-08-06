package com.song.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// 默认加在 ioc容器中的组件，容器启动会调用无参构造器创建对象，再进行初始化赋值等操作
@ToString
@Component
public class Boss {
    private Car car;

    public Car getCar() {
        return car;
    }

//    public Boss() {
//        System.out.println("Boss constructor...");
//    }

    // Spring 在启动时调用有参构造器创建对象
    // 构造器要用的组件，都是从容器中获取
//    @Autowired
    // 唯一的有参构造器，参数的 @Autowired 可以省略
    public Boss(Car car) {
        this.car = car;
        System.out.println("Boss car arg constructor...");
    }


    // @Autowired 标注在方法上，Spring 容器创建当前对象，就会调用方法，完成赋值
    // 方法使用的参数，自定义类型的值从 ioc容器中获取
//    @Autowired
    public void setCar(Car car) {
        this.car = car;
    }
}
