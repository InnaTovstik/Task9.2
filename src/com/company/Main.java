package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Main {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Italy", 20);
        map.put("France", 25);
        map.put("Ukraine", 30);
        map.put("Germany", 40);
        map.put("Argentina", 15);
        map.put("Belgium", 22);
        map.put("Canada", 1);
        map.put("Egypt", 6);
        map.put("Hungary", 8);
        map.put("Spain", 12);
        System.out.println(map);
        System.out.println(map.size());
        Map<Integer, String> newMap = new HashMap<>();
        for (Entry<String, Integer> entry : map.entrySet()) {
            newMap.put(entry.getValue(), entry.getKey());
        }
        System.out.println(newMap);
    }
}