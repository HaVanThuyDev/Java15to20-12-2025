package com.example.java.OPP.Encapsulation;

public class Student_Encapsulation {
    private int id;
    private String name;
    private  int  age;

    public int getAge() {
        return age ;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void display(int age)  {
        if (age < 0 || age >150){
            throw  new  IllegalArgumentException("Tuoi khong hop le");
        }
    }
    public static void main(String[] args) {
        Student_Encapsulation student = new Student_Encapsulation();
        student.display(3);
    }
}
