package com.ming.pojo;

public class User {
    private String name;

    public User() {
        System.out.println("User-> no args constructor");
    }

    public User(String name) {
        this.name = name;
        System.out.println("User-> args constructor");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void show(){
        System.out.println("name= "+name);
    }
}
