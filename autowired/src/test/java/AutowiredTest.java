import com.song.config.MainConfig;
import com.song.controller.BookController;
import com.song.service.BookService;
import com.song.service.impl.BookServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AutowiredTest {
    @Test
    public void test01() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);
        System.out.println("容器创建完成……");
        BookController bookController = context.getBean(BookController.class);
        bookController.print();

        BookService bean = context.getBean(BookService.class);
        System.out.println(bean);
    }
}
