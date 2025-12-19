package com.example.java.OPP.Lever4.Store_Account;

public class Product {
    private  Category category;
    private String productName;
    private double price;
    public Product( Category category,String productName, double price) {
        this.category = category;
        this.productName = productName;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Category getCategory() {
        return category;
    }
}
