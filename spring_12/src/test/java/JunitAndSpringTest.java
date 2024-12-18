import com.ming.service.UserService;
import jakarta.annotation.Resource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class JunitAndSpringTest {
    @Autowired// UserService实现类必须添加@Service
    UserService userService;

    @Test
    public void test01() {
        String result = userService.sayHello();
        System.out.println("result = " + result);
    }

    @Resource
    UserService userService02;

    @Test
    public void test02() {
        String result = userService.sayHello();
        System.out.println("result = " + result);
    }
}
