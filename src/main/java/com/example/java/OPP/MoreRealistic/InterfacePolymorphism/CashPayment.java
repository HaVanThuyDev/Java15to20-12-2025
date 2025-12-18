package com.example.java.OPP.MoreRealistic.InterfacePolymorphism;

public class CashPayment implements Payment {
    @Override
    public void pay (double amount) {
        System.out.println("Paying " + amount + " into CASH");
    }
}
