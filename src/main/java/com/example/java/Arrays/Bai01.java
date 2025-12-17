package com.example.java.Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Bai01 {
    public static void main(String[] args) {
        int[] mang;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so phan tu :");
        int n = sc.nextInt();
        mang = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap phan tu :" + (i + 1));
            mang[i] = sc.nextInt();
        }
        System.out.println(" CAC SO VUA NHAP LA ");
        for (int i = 0; i < mang.length; i++) {
            System.out.println(mang[i]);

        }
        Arrays.sort(mang);
        System.out.println("sap sep tang dan");
        for (int SL : mang) {
            System.out.println(SL);
        }
        int max = mang[0];
        for (int i = 1; i < mang.length; i++) {
            if (max < mang[i]) {
                max = mang[i];
            }
        }
        System.out.println("Max" + max);
        System.out.println("DEM SO CHAN");
        int demsochan = 0;
        int sum = 0;
        for (int SL : mang) {
            if (SL % 2 == 0) {
                demsochan++;
                sum += SL;
            }
        }
        System.out.println("Tong so chan la " + demsochan);
        System.out.println(sum);
        for (int SL : mang) {
            System.out.println(SL);
        }
        Map<Integer, Long> map = Arrays.stream(mang).boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        Map.Entry<Integer, Long> maxEntry = map.entrySet().stream().max(Map.Entry.comparingByValue()).orElse(null);
        if (maxEntry != null) {
            System.out.println("Phan tu xuat hien nhieu nhat"+maxEntry.getKey());
            System.out.println("So lan xuat hien"+maxEntry.getValue());
        }
    }
}
