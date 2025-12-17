package com.example.java.Renhanh;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Student {
    public static class Profile {
        String name;
        int toan;
        int van;
        int tienganh ;

        public Profile(String name, int tienganh, int toan, int van) {
            this.name = name;
            this.tienganh = tienganh;
            this.toan = toan;
            this.van = van;
        }
        public  double TinhdiemTB (){
            return tienganh + toan+tienganh/3;
        }
        public void Max (){
            int max=0;
            for (int i=0;i<=TinhdiemTB();i++){
                max=Math.max(max,i+1);
            }
            System.out.println(max);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Profile> profiles = new ArrayList<Profile>();
        System.out.println("So luong sinh vien: ");
        int n = sc.nextInt();
        sc.nextLine();// xoa kho bo nho dem
        for (int i = 0; i < n; i++) {
            System.out.println("Sinh vien: "+(i+1));
            System.out.println("Name:");
            String name = sc.nextLine();
            System.out.println("Toan: ");
            int toan = sc.nextInt();
            System.out.println("Van: ");
            int van = sc.nextInt();
            System.out.println("Tienganh: ");
            int tienganh = sc.nextInt();
            sc.nextLine();
            profiles.add(new Profile(name, toan, van, tienganh));
            System.out.println("Danh sach sinh vien");
            for (Profile S : profiles) {
                System.out.println(S.name+" "+S.toan+" "+S.van+" "+S.tienganh);

            }
        }

    }
}
