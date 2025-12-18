package com.example.java.OPP.AbstractClass;


 public abstract  class Employee {
    private int id;
    protected String name;
    protected double salary;

    public Employee(String name ) {
        this.name = name;
    }
    abstract double calculateSalary();
}
//Bài toán:Trừu tượng (Abstract Class)
//Lớp trừu tượng Employee
//
//Thuộc tính: name, salary
//
//Phương thức trừu tượng calculateSalary()
//
//Lớp con: FullTimeEmployee, PartTimeEmployee
//
//Yêu cầu:
//
//Mỗi loại nhân viên tính lương khác nhau