package com.example.java.wedday;

import com.example.java.Renhanh.Student;

import java.util.Scanner;

public class Swich {


    public static  void Student() {
        Long id;
        String name;
        int Toan;
        int van;
        int English;
    } ;
    public  Double DiemTb (int toan ,int english,int van){
        double sum = (toan+english+van)/3;
        System.out.println(sum);
        return sum;
    }

    public static void main(String[] args) {
        Swich obj = new Swich();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the student");
        int abc = sc.nextInt();
        switch (abc){
            case 1:
                obj.DiemTb(3,6,8);
                break;
                case 2:
                    System.out.println("Enter the name of the student");
                    break;
                    case 3:
                        System.out.println("Enter the name of the student");
                        break;
        }
    }
}
