import com.song.config.PersonConfig;
import com.song.entity.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ScopeTest {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(PersonConfig.class);
        System.out.println("ioc容器创建完成");
        Person person01 = (Person) context.getBean("person01");
        Person person02 = (Person) context.getBean("person01");
//        // 默认单实例
//        System.out.println(person01 == person02);
//
//        String[] definitionNames = context.getBeanDefinitionNames();
//        for (String name : definitionNames) {
//            System.out.println(name);
//        }
    }
}
