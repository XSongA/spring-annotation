package com.song.selector;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

import java.nio.charset.Charset;

// 自定义逻辑，返回需要注入的组件
public class MyImportSelector implements ImportSelector {
    /**
     * @param importingClassMetadata 当前标注 @Import 的类的所有注解信息
     * @return 要导入到容器中的组件的全类名数组
     */
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {

        for (String annotationType : importingClassMetadata.getAnnotationTypes()) {
            System.out.println("annotationType: " + annotationType);
        }
        // 返回 null 会导致 NPE
        return new String[]{"com.song.entity.Blue", "com.song.entity.Yellow"};
    }
}
