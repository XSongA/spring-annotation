import com.song.config.MainConfig;
import com.song.controller.BookController;
import com.song.repository.BookDAO;
import com.song.service.BookService;
//import com.song.service.impl.BookServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AutowiredTest {
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
