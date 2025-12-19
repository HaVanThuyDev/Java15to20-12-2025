package com.example.java.OPP.Lever4.Bank_Account;

public class Main {
    public static void main(String[] args) {
        SavingAccount save = new SavingAccount(5_000_000);
        CheckingAccount check = new CheckingAccount(2_000_000);
        save.withdraw(3_000_000);
        save.withdraw(3_000_000);
        check.withdraw(2_500_000);
        save.transfer(check,1_000_000);
        System.out.println("SO DU TAI KHOAN"+save.getBalance());
        System.out.println("KIEM TRA SO DU TAI KHOAN"+check.getBalance());

    }
}
//Trừu tượng + Interface + Đa hình
//
//Bài toán: Hệ thống quản lý tài khoản ngân hàng
//
//Abstract class Account
//
//balance
//
//deposit()
//
//withdraw() (abstract)
//
//Interface Transferable
//
//Các loại tài khoản:
//
//SavingAccount
//
//CheckingAccount
//
// Yêu cầu:
//
//Mỗi tài khoản có cách rút tiền khác nhau
//
//Áp dụng kiểm tra số dư