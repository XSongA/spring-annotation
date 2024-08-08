import com.song.config.MainConfig;
import com.song.config.ProfileConfig;
import com.song.controller.BookController;
import com.song.entity.Boss;
import com.song.entity.Car;
import com.song.entity.Color;
import com.song.entity.Yellow;
import com.song.repository.BookDAO;
import com.song.service.BookService;
//import com.song.service.impl.BookServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;

import javax.sql.DataSource;

public class AutowiredTest {
    @Test
    public void test06() {
        // 1. 使用无参构造器创建ApplicationContext
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        // 2. 设置需要激活的环境
        context.getEnvironment().setActiveProfiles("test");
        // 3. 注册主配置类
        context.register(ProfileConfig.class);
        // 4. 启动刷新容器
        context.refresh();
        System.out.println("容器创建完成……");

        String[] beanNamesForType = context.getBeanNamesForType(DataSource.class);
        for (String beanName : beanNamesForType) {
            System.out.println("dataSource: " + beanName);
        }

        Yellow bean = context.getBean(Yellow.class);
        System.out.println(bean);
    }

    @Test
    public void test05() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProfileConfig.class);
        System.out.println("容器创建完成……");
        String[] beanNamesForType = context.getBeanNamesForType(DataSource.class);
        for (String beanName : beanNamesForType) {
            System.out.println("dataSource: " + beanName);
        }
//        Yellow bean = context.getBean(Yellow.class);
//        System.out.println(bean);
    }

    @Test
    public void test04() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);
        System.out.println("容器创建完成……");
        System.out.println(context);
    }

    @Test
    public void test03() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);
        System.out.println("容器创建完成……");
        Color color = context.getBean(Color.class);
        System.out.println(color.getCar());

        Car car = context.getBean(Car.class);
        System.out.println(car);
    }

    @Test
    public void test02() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);
        System.out.println("容器创建完成……");
        Boss boss = context.getBean(Boss.class);
        System.out.println(boss.getCar());

        Car car = context.getBean(Car.class);
        System.out.println(car);
    }

    @Test
    public void test01() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);
        System.out.println("容器创建完成……");
        BookService bookService = context.getBean(BookService.class);
        bookService.print();

        // 此处放开执行会报错：NoUniqueBeanDefinitionException
//        BookDAO bean = context.getBean(BookDAO.class);
//        System.out.println(bean);
    }
}
