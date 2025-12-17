package com.example.java.Methods;

public class Java_Return {
    static int abc (int x){
        return x*2;
    }

    public static void main(String[] args) {
        for (int i =1;i<=5;i++){
            System.out.println(""+i+""+abc(i));
        }
    }

}
