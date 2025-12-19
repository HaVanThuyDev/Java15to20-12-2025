package com.example.java.OPP.MoreRealistic.InterfacePolymorphism;

public class Main {
    public static void main(String[] args) {
        CashPayment cashPayment = new CashPayment();
        cashPayment.pay(3000);
        CreditCardPayment creditCardPayment = new CreditCardPayment();
        creditCardPayment.pay(3000);
        MomoPayment momoPayment = new MomoPayment();
        momoPayment.pay(3000);
    }
}
//Trừu tượng + Interface + Đa hình

//Bài toán: Hệ thống quản lý tài khoản ngân hàng

//Abstract class Account
//balance
//deposit()
//withdraw() (abstract)

//Interface Transferable
//Các loại tài khoản:
//SavingAccount
//CheckingAccount

// Yêu cầu:
//Mỗi tài khoản có cách rút tiền khác nhau
//Áp dụng kiểm tra số dư