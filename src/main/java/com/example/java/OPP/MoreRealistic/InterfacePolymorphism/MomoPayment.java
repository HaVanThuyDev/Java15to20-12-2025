package com.example.java.OPP.MoreRealistic.InterfacePolymorphism;

public class MomoPayment implements Payment{
    @Override
    public void pay(double amount) {
        System.out.println("Momo payment of " + amount + ".");
    }
}
