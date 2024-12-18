package com.ming.pojo;

public class UserT {
    private String name;

    public UserT() {
        System.out.println("UserT-> no args constructor");
    }

    public UserT(String name) {
        this.name = name;
        System.out.println("UserT-> all args constructor");
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
