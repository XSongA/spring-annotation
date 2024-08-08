import com.song.config.MainConfig;
import com.song.controller.BookController;
import com.song.entity.Boss;
import com.song.entity.Car;
import com.song.entity.Color;
import com.song.repository.BookDAO;
import com.song.service.BookService;
//import com.song.service.impl.BookServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AutowiredTest {

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
