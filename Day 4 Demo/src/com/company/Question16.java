package com.company;

import java.util.HashMap;

/*
Write a Java program to copy all of the mappings from the specified map to another map

 */
public class Question16 {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();

        hashMap.put(1, "A");
        hashMap.put(2, "B");
        hashMap.put(3, "C");

        System.out.println(hashMap);

        HashMap<Integer, String> hashMap2 = new HashMap<>();

        hashMap2.put(10, "Z");
        hashMap2.put(20, "Y");
        hashMap2.put(30, "X");

        hashMap2.putAll(hashMap);
        System.out.println(hashMap2);
    }
}
