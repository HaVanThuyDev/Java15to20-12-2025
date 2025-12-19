package com.example.java.OPP.Lever4.Bank_Account;

public class CheckingAccount extends Account {
    private static final double SODUTAIKHOAN =10_000_000;
    public CheckingAccount(double balance) {
        super(balance);
    }
    @Override
    void withdraw ( double amount) {
        if(amount > 0 && balance - amount >= -SODUTAIKHOAN) {
            balance -= amount;
            System.out.println("Withdrawn Successfully"+amount+"From account balance");
        }
        else {
            System.out.println("Withdrawn Failed");
        }
    }
}
