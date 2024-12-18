## getBean(),name 默认为user(lowcase)
```java
public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user = context.getBean("user", User.class);
        System.out.println(user);
    }
}
```
## Annotation
```xml
 <context:component-scan base-package="com.ming.pojo"></context:component-scan>
 <context:annotation-config/>

```
annotation只负责自己类的使用，负责完成属性注入。