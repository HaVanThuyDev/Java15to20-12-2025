package com.example.java.OPP.Lever4.Store_Account;

import java.util.List;

public class Order {
    private Customer customer;
    private  List<Product> products;
    private Category category;
    private  List <Category> categories;

    public Order ( List<Category> categories ,Customer customer, List<Product> products) {
        this.categories = categories;
        this.customer = customer;
        this.products = products;

    }
    public List<Product> getProducts() {
        return products;
    }
    public double getTotalPrice() {
        double totalPrice = 0;
        for (Product product : products) {
            totalPrice += product.getPrice();
        }
        return totalPrice;
    }
    public void Detail (){
        for (Product ds : products) {
            System.out.println("Ten san pham : " + ds.getProductName()+ "Danh muc :"+ds.getCategory().getName()+ "Gia : " +ds.getPrice());
        }
    }
}
