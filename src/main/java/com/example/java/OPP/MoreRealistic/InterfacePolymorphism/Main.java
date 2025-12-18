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
//6️⃣ Interface + Đa hình
//
//Bài toán:
//
//Interface Payment
//
//pay(double amount)
//
//Các lớp:
//
//CashPayment
//
//CreditCardPayment
//
//MomoPayment
//
// Yêu cầu:
//
//Xử lý thanh toán không cần biết loại thanh toán cụ thể