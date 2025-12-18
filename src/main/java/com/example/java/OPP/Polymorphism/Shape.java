package com.example.java.OPP.Polymorphism;

public class Shape {
    public  void draw() {
        System.out.println("xin chao minh ten hung");

    }
}
// DB :Bài toán:Đa hình (Polymorphism)
//
//Lớp Shape có phương thức draw()
//
//Các lớp con: Circle, Rectangle
//
// Yêu cầu:
//
//Override draw()
//
//Dùng Shape shape = new Circle()
//Shape shape = new Rectangle();
//shape.draw(); // gọi đúng phương thức của Rectangle