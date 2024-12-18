package com.ming.demo03;

public class Client {
    public static void main(String[] args) {
        //real subject 真实角色
        Landlord landlord = new Landlord();
        //proxy,代理角色，需要生成
        ProxyInvocationHandler pih = new ProxyInvocationHandler();
        //interface object 接口对象
        pih.setRent(landlord);
        //动态生成的proxy
        Rent proxy= (Rent) pih.getProxy();
        proxy.rent();

    }
}
