package com.ming.demo01;

public class Landlord implements Rent{
    @Override
    public void rent() {
        System.out.println("Landlord wants to rent the house");
    }
}
