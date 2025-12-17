package com.example.java.Renhanh;

import java.util.Scanner;

public class KiemtraNamNhuan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Nhap nam hien tai :");
        int n = sc.nextInt();
        if (n %4==0 && n %100!=0 || n %400==0){
            System.out.println(n+"la nam nhuan");
        }else {
            System.out.println(n+"khong phai la nam nhuan");
        }
    }
}
