package com.example.java.Methods;

import java.util.Scanner;

public class Bai02 {
     static  void Xinchao (String ten){
        System.out.println(ten+"Thuy");
    }
   static boolean isVen (int n ){
         if (n%2==0){
             return true;
         }
         return false;
    }
    static  void Tinhtong (int a, int b){
         System.out.println("tong cua hai so "+a+b);
    }
    static void vonglap(int n){
         int demso =0;
         for( int i =0;i<=n;i++){
             demso+=i;
         }
         System.out.println("Tong so la: "+demso);
    }
    static boolean isPrime ( int n){
         if (n<=1){
             return false;
         }
         for (int i = 2; i*i <=n; i++){
             if (n%i==0){
                 return false;
             }

         }
         return true;
    }
    static void inmang ( int []mang){
         int [] a ={3,2,4,3,5,6,7,8,9,0,10};
         for (int S :a){
             System.out.print(S+" ");
         }
         int max=0;
         for (int lon :a){
             if (lon>max){
                 max=lon;
             }
         }
         System.out.println("Max"+max);
         int dem =0;
         for (int sochan :a){
             if (sochan %2==0){
                 dem++;
             }
             System.out.print(sochan +" ");
         }
        System.out.println("TONGSO CHAN"+dem);
     }
    public static void main(String[] args) {
        Xinchao("Xinchao");
        System.out.println(isVen(20));
        Tinhtong(30,20);
        vonglap(10);
        System.out.println(isPrime(10));
        int [] mang;
        mang = new int[5];
        for (int i = 0; i <mang.length; i++){
            mang[i] = i;
        }
        System.out.println(" CAC PHAN TU DA nhap la ");
        for ( int SL :mang){
            System.out.println(SL+",");
        }
        System.out.println(" CAC PHAN TU DA nhap la ");
        inmang(mang);
    }
}
