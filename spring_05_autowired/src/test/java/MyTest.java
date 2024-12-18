import com.ming.pojo.Person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {


    }

    @Test
    public void test01(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Person person= context.getBean("person", Person.class);
       person.getCat().meow();
       person.getDog().bark();
    }

    @Test
    public void test02(){
    ApplicationContext context = new ClassPathXmlApplicationContext("annobeans.xml");
    Person person= context.getBean("person", Person.class);
    person.getCat().meow();
    person.getDog().bark();

}
}
