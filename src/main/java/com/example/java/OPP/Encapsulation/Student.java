package com.example.java.OPP.Encapsulation;

import java.util.Scanner;

public class Student {
    public int msv;
    public String name;
    public  int tuoi;
    double Diemtb;
    public void Nhap (){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap soluong :");
        int n=sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap msv :");
            msv = sc.nextInt();
            System.out.print("Nhap ten :");
            name = sc.nextLine();
            System.out.print("Nhap tuoi :");
            tuoi = sc.nextInt();
            System.out.print("Nhap Diemtb :");
            Diemtb = sc.nextDouble();
        }

    }
    public void Xuat (){
        System.out.println("msv"+msv+"hoten"+name+"tuoi");
    }
    public void DiemTB(){
        if(Diemtb>=8){
            System.out.println("gioi");
        }if (Diemtb>=6.5){
            System.out.println("Kha");
        }else if (Diemtb>=5){
            System.out.println("Trung Binh");
        }else {
            System.out.println("Ngu");
        }
    }
    public static void main(String[] args) {
        Student stydent = new Student();
        stydent.Nhap();
        stydent.Xuat();
        stydent.DiemTB();

    }
}
