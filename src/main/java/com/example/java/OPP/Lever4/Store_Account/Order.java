package com.example.java.OPP.Lever4.Store_Account;

import java.util.List;

public class Order {
    private Customer customer;
    List<Product> products;

    public Order (Customer customer, List<Product> products) {
        this.customer = customer;
        this.products = products;

    }
    public double getTotalPrice() {
        double totalPrice = 0;
        for (Product product : products) {
            totalPrice += product.getPrice();
        }
        return totalPrice;
    }
}
