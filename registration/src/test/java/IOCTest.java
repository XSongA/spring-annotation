import com.song.config.MainConfig;
import com.song.config.PersonConfig;
import com.song.entity.Blue;
import com.song.entity.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.Environment;

import java.util.Map;

public class IOCTest {
    @Test
    public void testFactoryBean() {
        ApplicationContext context = new AnnotationConfigApplicationContext(PersonConfig.class);
        String[] definitionNames = context.getBeanDefinitionNames();
        for (String name : definitionNames) {
            System.out.println(name);
        }

        // 工厂 Bean 获取的是调用 getObject 方法创建的对象
        Object bean = context.getBean("colorFactoryBean");
        Object bean2 = context.getBean("colorFactoryBean");
        System.out.println("FactoryBean 创建的 Bean 的类型: " + bean);
        System.out.println("bean == bean2: " + (bean == bean2));

        // BeanFactory.FACTORY_BEAN_PREFIX = "&"
        // 要获取工厂 Bean 本身，需要在 id 前加一个 "&" 标识：&colorFactoryBean
        Object bean3 = context.getBean("&colorFactoryBean");
        System.out.println(bean3.getClass());
    }

    @Test
    public void testImport() {
        ApplicationContext context = new AnnotationConfigApplicationContext(PersonConfig.class);
        String[] definitionNames = context.getBeanDefinitionNames();
        for (String name : definitionNames) {
            System.out.println(name);
        }

//        Blue blue = context.getBean(Blue.class);
//        System.out.println(blue);
    }

    @Test
    public void testScope() {
        ApplicationContext context = new AnnotationConfigApplicationContext(PersonConfig.class);
//        String[] definitionNames = context.getBeanDefinitionNames();
//        for (String name : definitionNames) {
//            System.out.println(name);
//        }

        System.out.println("ioc容器创建完成……");

        Object person01 = context.getBean("person");
        Object person02 = context.getBean("person");
//        System.out.println(person01 == person02);
    }

    @Test
    public void testConditional() {
        ApplicationContext context = new AnnotationConfigApplicationContext(PersonConfig.class);
////        String[] definitionNames = context.getBeanDefinitionNames();
////        for (String name : definitionNames) {
////            System.out.println(name);
////        }
//
//        System.out.println("ioc容器创建完成……");
//
//        Object person01 = context.getBean("person");
//        Object person02 = context.getBean("person");
////        System.out.println(person01 == person02);
//        String[] beanNamesForType = context.getBeanNamesForType(Person.class);
//        for (String name : beanNamesForType) {
//            System.out.println(name);
//        }

//        // 获取环境变量中操作系统的名称
//        Environment environment = context.getEnvironment();
//        String osName = environment.getProperty("os.name");
//
//        // Mac OS X
//        System.out.println(osName);

        Map<String, Person> beansOfType = context.getBeansOfType(Person.class);
        for (Map.Entry<String, Person> personEntry : beansOfType.entrySet()) {
            System.out.println(personEntry);
        }

    }
}
