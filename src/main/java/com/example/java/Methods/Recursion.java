package com.example.java.Methods;

import java.util.Arrays;
import java.util.Scanner;

public class Recursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("NHAP SO LUONG : ");
        int n = sc.nextInt();
        int []mang ;
        mang = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter number"+i);
            mang[i] = sc.nextInt();
        }
        System.out.println("DS phan tu sau khi nhap la ");
        for (int i = 0; i < mang.length; i++) {
            System.out.print(mang[i]+" ");
        }
        int max =mang[0];
        for (int SL : mang) {
            if (SL > max) {
                max = SL;
            }
        }
        System.out.println("Max"+max);
        int min =mang[0];
        for (int SL : mang) {
            if (SL < min) {
                min = SL;
            }
        }
        System.out.println("Min"+min);
        System.out.println("so chan co trong mang la");
        int demsochan=0;
        for (int SL : mang) {
            if(SL %2==0){
                System.out.println(SL);
                demsochan++;
            }
        }
        System.out.println("tong so chan la :"+demsochan);
        int sum =0;
        for (int SL : mang) {
           if(SL %2==0){
               sum+=SL;
           }
        }
        for (int SL : mang) {
            int key =mang[SL];
            int j =SL-1;
            while (j<0 && mang[j]!=key) {
                mang[j+1]=mang[j];
                j--;
            }
            mang[j+1]=key;
        }
        for (int X : mang) {
            System.out.print(X);
        }
        System.out.println("sum"+sum);
        Arrays.sort(mang);
        for (int SS : mang) {
            System.out.println(SS);
        }
        }

    };
