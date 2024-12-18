package com.ming.service;

public class UserServiceImpl implements UserService{
    @Override
    public void add() {
        System.out.println("add an user");
    }

    @Override
    public void delete() {
        System.out.println("delete an user");
    }

    @Override
    public void update() {
        System.out.println("update an user");
    }

    @Override
    public void query() {
        System.out.println("query an user");
    }
}
