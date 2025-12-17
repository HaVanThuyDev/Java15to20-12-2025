package com.example.java.Renhanh;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Lisy {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("Thuy",8);
        map.put("Huan",9);
        map.put("Thai",10);
        map.put("Jai",11);
        for(Map.Entry<String,Integer> entry:map.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
        for (Integer n : map.values())  {
            String key=map.keySet().toString();
            System.out.println(n+key);

        }

    }
}
