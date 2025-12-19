package com.example.java.OPP.Lever4.Store_Account;

public class OrderService {
    public void Oder(Order order,Payment payment) {
        order.Detail();
        double total = order.getTotalPrice();
        payment.pay(total);
    }
}
