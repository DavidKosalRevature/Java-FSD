package com.company;

import java.util.HashMap;
import java.util.Map;

/*
Write a Java program to count the number of key-value (size) mappings in a map

 */
public class Question15 {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();

        hashMap.put(1, "A");
        hashMap.put(2, "B");
        hashMap.put(3, "C");

        System.out.println(hashMap.size());

    }
}
