package com.ming.demo01;

public class Proxy implements Rent {
    private Landlord landLord;

    public Proxy() {
    }

    public Proxy(Landlord landLord) {
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
