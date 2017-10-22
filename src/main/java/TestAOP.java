
import com.warframe.springaop.bean.impl.GreetingImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Author warframe[github.com/WarframePrimer]
 * @Date 2017/10/21 10:04
 */
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations = {"classpath:spring/spring-config.xml"})
public class TestAOP {
    @Test
    public void testAOP1(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring/spring-*.xml");

        GreetingImpl greetingProxy = (GreetingImpl) applicationContext.getBean("greetingProxy1");
        greetingProxy.sayHello("warframe");
        greetingProxy.goodMorning("warframe");


    }


    @Test
    public void testAspectJ(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring/spring-*.xml");

        GreetingImpl greeting = (GreetingImpl) applicationContext.getBean("greetingImpl");
        greeting.sayHello("warframe");
        greeting.goodMorning("warframe");
    }



}
