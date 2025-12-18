package com.example.java.OPP.AbstractClass;

public class PartTimeEmployee extends Employee {
    private int sogio;
    private int songay;

    public PartTimeEmployee(String name,int sogio,int songay ) {
        super(name);
        this.sogio=sogio;
        this.songay=songay;
    }
    @Override
    double calculateSalary() {
        return sogio*songay;
    }
}
