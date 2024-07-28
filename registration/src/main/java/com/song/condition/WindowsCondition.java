package com.song.condition;

import com.song.config.PersonConfig;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.context.annotation.Conditional;
import org.springframework.core.env.Environment;
import org.springframework.core.io.ResourceLoader;
import org.springframework.core.type.AnnotatedTypeMetadata;

import java.lang.annotation.Annotation;

// 判断操作系统是否是 Windows
public class WindowsCondition implements Condition {
    /**
     * @param context  上下文（环境）
     * @param metadata 注释信息
     */
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        Environment environment = context.getEnvironment();
        // ConfigurableListableBeanFactory
        ConfigurableListableBeanFactory beanFactory = context.getBeanFactory();
        // ClassLoader
        ClassLoader classLoader = context.getClassLoader();
        // BeanDefinitionRegistry
        // 可以判断容器中 Bean 的注册情况，也可以给容器中注册 Bean
        BeanDefinitionRegistry registry = context.getRegistry();
        boolean definition = registry.containsBeanDefinition("person");
        // ResourceLoader
        ResourceLoader resourceLoader = context.getResourceLoader();

        String osName = environment.getProperty("os.name");
        if (osName == null) {
            return false;
        }
        return osName.contains("Windows");
    }
}
