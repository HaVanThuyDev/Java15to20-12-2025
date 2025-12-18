package com.example.java.OPP.AbstractClass;

 public class FullTimeEmployee extends Employee   {
    public FullTimeEmployee(String name, double salary) {
        super(name);
        this.salary = salary;
    }
    @Override
    double calculateSalary() {
        return salary;
    }
}
