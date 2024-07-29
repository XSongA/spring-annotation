import com.song.config.MainConfigOfLifeCycle;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LifeCycleTest {
    @Test
    public void testInitAndDestroy() {
        // 1、创建 ioc容器
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfigOfLifeCycle.class);
        System.out.println("容器创建完成……");
//        for (String name : context.getBeanDefinitionNames()) {
//            System.out.println(name);
//        }

        // 关闭容器
        context.close();
    }
}
