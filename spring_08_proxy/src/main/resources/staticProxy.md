## Interface
```java
public interface Rent {
    public void rent();    
}
```
## real subject
```java
public class LandLord implements Rent{
    @Override
    public void rent() {
        System.out.println("Landlord wants to rent the house");
    }
}
```
## proxy
```java
public class Proxy implements Rent {
    private LandLord landLord;

    public Proxy() {
    }

    public Proxy(LandLord landLord) {
        this.landLord = landLord;
    }

    @Override
    public void rent() {
        landLord.rent();
    }

    public void contract() {
        System.out.println("sign contract");
    }

}
```
## client
```java
public class Client {
    public static void main(String[] args) {
        LandLord landLord = new LandLord();
        Proxy proxy = new Proxy();
        //直接通过proxy租房，不需要面对Landlord
        proxy.rent();
    }
}
```
## ! real subject need to be created by constructor or setters
```java
 public class Client {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        UserServiceProxy userServiceProxy = new UserServiceProxy(userService);
        //userServiceProxy.setUserService(userService);
        userServiceProxy.create();
    }
}
```
