package com.example.java.OPP.Lever4.Bank_Account;

public abstract class Account implements Transferable {
   protected double balance;

   public Account(double balance) {
       this.balance = balance;
   }
   public void deposit(double amount) {
       if (amount>0) {
           balance += amount;
           System.out.println("Deposit "+amount+"successful");
       }
   }
   abstract  void withdraw(double amount);
   public double getBalance() {
       return balance;
   }
   @Override
    public void transfer (Account target,double amount ){
       this.withdraw(amount);
       target.deposit(amount);
       System.out.println("Transfer "+amount+"successful");
   }
}
