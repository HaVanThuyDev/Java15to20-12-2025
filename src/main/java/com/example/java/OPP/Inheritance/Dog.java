package com.example.java.OPP.Inheritance;

public class Dog extends Animal {
    public void bark (){
        System.out.println("My name is Thuy, I'm 20 years old, I live in Ha Noi, I'm studding Ha Noi, in the Duy Ta");
    }
    public static void main(String [] args){
        Dog dog = new Dog();
        dog.eat();
        dog.bark();
    }
    }

//Bài toán:Kế thừa (Inheritance)
//
//Lớp Animal có phương thức eat()
//
//Lớp Dog kế thừa Animal, thêm phương thức bark()
//
//Yêu cầu:
//
//Gọi được eat() từ Dog