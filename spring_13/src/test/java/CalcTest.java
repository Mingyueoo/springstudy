import com.ming.service.CalcService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class CalcTest {
    @Autowired
    CalcService calcService;

    @Test
    public void test01() {
        int result = calcService.add(10, 5);
        System.out.println("test01方法中的result = "+result);
    }

    @Test
    public void test02() {
        int result = calcService.div(10, 1);
        System.out.println("test02方法中的result = "+result);
    }
}
