package com.example.java.OPP.AbstractClass;

public class Main {
    public static void main(String[] args) {
        FullTimeEmployee full =new FullTimeEmployee("Thuy",300000);
        System.out.println("luong nhan vien full time "+full.calculateSalary());
        PartTimeEmployee part =new PartTimeEmployee("Huong",120,20);
        System.out.println("luong nhan vien part time "+part.calculateSalary());
    }
}
