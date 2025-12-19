package com.example.java.OPP.Lever4.Bank_Account;

public class SavingAccount extends Account {
    public SavingAccount(double balence) {
        super(balence);
    }
    @Override
     void withdraw (double amount) {
        if (amount >0 || amount<= balance){
            balance -= amount;
            System.out.println("Withdraw Success");
        }else {
            System.out.println("Withdraw Failed");
        }

    }
}
