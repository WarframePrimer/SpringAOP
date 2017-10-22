import com.warframe.springaop.bean.Apology;
import com.warframe.springaop.bean.Greeting;
import com.warframe.springaop.bean.impl.GreetingImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author warframe[github.com/WarframePrimer]
 * @Date 2017/10/21 10:04
 */
public class TestAOP {
    @Test
    public void testAOP1(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring/spring-*.xml");

        GreetingImpl greetingProxy = (GreetingImpl) applicationContext.getBean("greetingProxy1");
        greetingProxy.sayHello("warframe");
        greetingProxy.goodMorning("warframe");


    }
}
