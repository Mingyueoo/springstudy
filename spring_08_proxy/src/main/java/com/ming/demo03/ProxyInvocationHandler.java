package com.ming.demo03;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
//
public class ProxyInvocationHandler implements InvocationHandler {
    //because in getProxy(), has the args need interface-->rent.getClass().getInterfaces()
    //Rent rent --> Object target;替换后可编程万能模板
    private Rent rent;

    public void setRent(Rent rent) {
        this.rent = rent;
    }

    public Object getProxy(){
        return Proxy.newProxyInstance(this.getClass().getClassLoader(), rent.getClass().getInterfaces(),  this);
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //reflection
        Object result = method.invoke(rent,args);
        return result;
    }
}
