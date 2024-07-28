package com.song.bean;

import com.song.entity.Color;
import com.song.entity.White;
import org.springframework.beans.factory.FactoryBean;

// 创建一个 Spring 定义的 FactoryBean
public class ColorFactoryBean implements FactoryBean<Color> {
    @Override
    // 返回一个 Color 对象，这个对象会添加到容器中
    public Color getObject() throws Exception {
        System.out.println("ColorFactoryBean getObject createBean...");
        return new White();
    }

    @Override
    public Class<?> getObjectType() {
        return Color.class;
    }

    @Override
    // 返回 true：单实例，在容器中只保留一份
    // 返回 false：多实例，每次获取创建一个新的
    public boolean isSingleton() {
        return false;
    }
}
