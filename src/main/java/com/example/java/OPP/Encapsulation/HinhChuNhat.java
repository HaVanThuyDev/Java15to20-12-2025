package com.example.java.OPP.Encapsulation;

import java.util.Scanner;

public class HinhChuNhat {
    public  int chieudai;
     public int chieurong ;
     double chuvi;
     float dientich;
     public  void Nhap (){
         Scanner sc = new Scanner(System.in);
         System.out.println("Nhap chieudai");
         chieudai = sc.nextInt();
         System.out.println("Nhap chieurong"+chieurong);
         chieurong = sc.nextInt();
     }
     public void Chuvi (){
         chuvi= (chieurong+chieudai) *2;
     }
     public void Dentich (){
         dientich= chieudai * chieurong;
     }
     public void hienthi (){
         System.out.println("chu vi hinh chu nhat la :"+chuvi);
         System.out.println("dien tich hinh chu nhat la"+dientich);
     }
     public static void main(String[] args) {
         HinhChuNhat HCN = new HinhChuNhat();
         HCN.Nhap();
         HCN.Chuvi();
         HCN.Dentich();
         HCN.hienthi();
     }
}
