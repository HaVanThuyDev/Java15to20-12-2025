package com.example.java.OPP.Lever4.Store_Account;

public class CashPayment implements Payment{
    @Override
    public void pay (double amount) {
        System.out.println("Thanh toán"+amount);
    }
}
