package com.ming.demo02;

public class UserServiceProxy implements UserService{
    //use composition
    private UserServiceImpl userService;

    public UserServiceProxy() {
    }

    public UserServiceProxy(UserServiceImpl userService) {
        this.userService = userService;
    }

    public void setUserService(UserServiceImpl userService) {
        this.userService = userService;
    }

    @Override
    public void create() {
        log("create");
        userService.create();

    }

    @Override
    public void read() {
        log("read");
        userService.read();

    }

    @Override
    public void update() {
        log("update");
        userService.update();

    }

    @Override
    public void delete() {
        log("delete");
        userService.delete();

    }

    public void log(String msg){
        System.out.println("Using the " + msg +" method");
    }
}
