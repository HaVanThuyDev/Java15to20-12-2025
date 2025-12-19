package com.example.java.OPP.Lever4.Store_Account;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("minhduc@gmai.com","Duc2003");
        Category category1 = new Category(1,"san pham cong nghe","Thiet bi di dong");
        Category category2 = new Category(2,"san pham gia dung","Thiet bi di dong");
        Product sp1 = new Product(category1,"iPhone ",1.50000);
        Product sp2 = new Product(category2,"may giat ",2.50000);
        List<Product> products=new ArrayList<Product>();
        products.add(sp1);
        List <Category> categories = new  ArrayList();
        categories.add(category1);
        Order oder = new Order( categories,customer, products);
        Payment payment = new CashPayment() ;
        OrderService orderService = new OrderService();
        orderService.Oder(oder,payment);


    }
}
