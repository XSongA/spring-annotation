import com.song.config.PersonConfig;
import com.song.entity.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonTest {
    public static void main(String[] args) {
//        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
//        Person person = (Person) context.getBean("person");
//        System.out.println(person);
        ApplicationContext context = new AnnotationConfigApplicationContext(PersonConfig.class);
//        Person person = (Person) context.getBean("person01");
        Person person = (Person) context.getBean(Person.class);
//        String[] namesForType = context.getBeanNamesForType(Person.class);
//        for (String name : namesForType) {
//            System.out.println(name);
//        }
        System.out.println(person);
    }
}
