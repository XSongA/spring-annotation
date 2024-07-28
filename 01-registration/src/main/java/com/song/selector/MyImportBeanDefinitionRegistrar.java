package com.song.selector;

import com.song.entity.RainBow;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

public class MyImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {
    /**
     * @param importingClassMetadata 当前标注 @Import 的类的所有注解信息
     * @param registry               BeanDefinition 注册类
     *                                   将所有需要添加到容器中的 Bean，
     *                                   调用 BeanDefinitionRegistry.registerBeanDefinition 手动注册进来
     */
    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        boolean definition = registry.containsBeanDefinition("com.song.entity.Red");
        boolean definition2 = registry.containsBeanDefinition("com.song.entity.Blue");
        if (definition && definition2) {
            System.out.println("contains red and blue……");
            // 指定 Bean 的定义信息（类型、Scope……）
            RootBeanDefinition beanDefinition = new RootBeanDefinition(RainBow.class);
            // 指定 Bean 的名称注册
            registry.registerBeanDefinition("rainBow", beanDefinition);
        } else {
            System.out.println("no contain red and blue……");
        }
    }
}
