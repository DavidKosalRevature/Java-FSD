package com.company;

import java.util.HashMap;

/*
Write a Java program to associate the specified value with the specified key in a HashMap

 */
public class Question14 {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();

        hashMap.put(1, "A");
        hashMap.put(2, "B");
        hashMap.put(3, "C");

        hashMap.forEach((k,v) -> System.out.println(k + " : " + v));
    }
}
