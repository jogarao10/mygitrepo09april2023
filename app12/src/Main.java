import com.durgasoft.beans.Hello;
import com.durgasoft.beans.Hi;
import com.durgasoft.beans.Wish;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("SpringConfig.xml");
        Wish wish = (Wish) applicationContext.getBean("wish");
        System.out.println(wish.sayWish());

        Hello hello = (Hello) applicationContext.getBean("hello");
        System.out.println(hello.sayHello());

        Hi hi = (Hi) applicationContext.getBean("hi");
        System.out.println(hi.sayHi());
    }
}