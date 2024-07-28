import com.song.config.BookConfig;
import com.song.config.MainConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainTest {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);
        String[] definitionNames = context.getBeanDefinitionNames();
        for (String name : definitionNames) {
            System.out.println(name);
        }
    }
}
