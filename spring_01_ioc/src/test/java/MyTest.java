import com.ming.dao.UserDaoMysqlImpl;
import com.ming.dao.UserDaoOracleImpl;
import com.ming.service.UserService;
import com.ming.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
//        UserService userService = new UserServiceImpl();
//        ((UserServiceImpl) userService).setUserDao(new UserDaoMysqlImpl());
//        ((UserServiceImpl) userService).setUserDao(new UserDaoOracleImpl());
//
//        userService.getUser();
       ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        UserServiceImpl userService = (UserServiceImpl) context.getBean("userService");
        userService.getUser();

    }
}
