package com.example.java.Methods;

public class Oxerloadding {
    static int a (int x, int b){
        return x+b;
    }
    static double b (double x, double y){
        return x+y;
    }
    public static void main(String[] args) {
        int one = a(3,7);
        double two = b(3.6,7.8);
        System.out.println(one);
        System.out.println(two);
    }
}
