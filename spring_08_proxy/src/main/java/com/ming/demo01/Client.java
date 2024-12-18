package com.ming.demo01;

public class Client {
    public static void main(String[] args) {
        Landlord landLord = new Landlord();
        Proxy proxy = new Proxy();
        //直接通过proxy租房，不需要面对Landlord
        proxy.rent();
    }
}
