import com.song.config.MainConfig;
import com.song.entity.Person;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AttributeAssignmentTest {
    @Test
    public void test01() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);
        System.out.println("容器创建完成……");

        String[] definitionNames = context.getBeanDefinitionNames();
        for (String name : definitionNames) {
            System.out.println(name);
        }

        System.out.println();

        Person person = (Person) context.getBean("person");
        System.out.println("person = " + person);

        // 从环境变量中获取配置项的值
        String property = context.getEnvironment().getProperty("person.country");
        System.out.println("person.country = " + property);
    }
}
