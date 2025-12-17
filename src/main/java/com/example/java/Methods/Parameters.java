package com.example.java.Methods;

import javax.naming.Name;

public class Parameters {
    static void Name (String name ,int tuoi) {
        System.out.println(name + " " + tuoi);

    }
    static void Check(int tuoi){
        if(tuoi>18){
            System.out.println("Tuoi");
        }else {
            System.out.println("TuoiL");
        }
    }
    public static void main(String[] args) {
        Name("Thuy",7);
        Name("Thuy",9);
        Name("Thuy",120);
        Check(12);
    }
}
