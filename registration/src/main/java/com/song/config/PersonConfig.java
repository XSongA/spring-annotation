package com.song.config;

import com.song.bean.ColorFactoryBean;
import com.song.condition.LinuxCondition;
import com.song.condition.MacCondition;
import com.song.condition.WindowsCondition;
import com.song.entity.Color;
import com.song.entity.Person;
import com.song.entity.Red;
import com.song.selector.MyImportBeanDefinitionRegistrar;
import com.song.selector.MyImportSelector;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.*;

@Configuration
// 导入组件，id 默认是组件的全类名
//@Import(Color.class)
//@Import({Color.class, Red.class})
//@Import(
//        {
//                Color.class
//                , Red.class
//                , MyImportSelector.class
//                , MyImportBeanDefinitionRegistrar.class
//        }
//)
// 类中组件统一设置，满足当前条件，这个类中配置的所有 Bean 注册才能生效
//@Conditional(MacCondition.class)
public class PersonConfig {
    /**
     * 类型为返回值类型
     * id为方法名（默认）/指定id
     *
     * @return bean
     */
    //
    /**
     * ConfigurableBeanFactory.SCOPE_PROTOTYPE = "prototype"
     * ConfigurableBeanFactory.SCOPE_SINGLETON = "singleton"
     * org.springframework.web.context.WebApplicationContext.SCOPE_REQUEST request
     * org.springframework.web.context.WebApplicationContext.SCOPE_SESSION session
     */
    // singleton：单实例（默认）。ioc容器启动时调用方法创建对象放到 ioc容器中，以后每次从容器中取
    // prototype：多实例。ioc容器启动时不创建，每次获取的时候调用方法创建
    // request：web环境同一个请求创建一个实例
    // session：web环境同一个 session 创建一个实例
    //
    /**
     * 懒加载
     *     单实例Bean：默认在容器启动时创建对象
     *     懒加载：容器启动不创建对象。第一次使用（获取）Bean 的时候创建对象，并初始化
     */
    //

    /**
     * @Conditional({Condition}): 按照一定条件进行判断，满足条件给容器中注册 Bean
     * 如果系统为 Windows，向容器中注入 "bill"
     * 如果系统为 Linux，向容器中注入 "linus"
     */

//    @Bean("person01")
    @Bean
    // 懒加载
//    @Lazy
//    @Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Person person() {
//        System.out.println("创建 Person 对象...");
        return new Person("ls", 20);
    }

    //    @Bean("bill")
    @Conditional({WindowsCondition.class})
    public Person person01() {
        return new Person("Bill Gates", 69);
    }

    //    @Bean("jobs")
    @Conditional({MacCondition.class})
    public Person person02() {
        return new Person("Steve Jobs", 66);
    }

    //    @Bean("linus")
    @Conditional({LinuxCondition.class})
    public Person person03() {
        return new Person("Linus", 54);
    }

    @Bean
    public ColorFactoryBean colorFactoryBean() {
        return new ColorFactoryBean();
    }
}
