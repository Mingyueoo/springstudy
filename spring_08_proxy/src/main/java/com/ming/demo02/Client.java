package com.ming.demo02;

public class Client {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        UserServiceProxy userServiceProxy = new UserServiceProxy(userService);
        //userServiceProxy.setUserService(userService);
        userServiceProxy.create();
    }
}
