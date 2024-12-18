import com.ming.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        User user = (User) context.getBean("user");
        User user2 = context.getBean(User.class);
        System.out.println(user.toString());
        System.out.println(user2.toString());
        user.show();
    }
}
