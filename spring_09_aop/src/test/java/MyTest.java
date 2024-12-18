import com.ming.service.UserService;
import com.ming.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
         ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
         //dynamic proxy is interface.
         UserService userService = (UserService) context.getBean("userService");
         userService.add();



    }
}
