package com.company;

import java.util.HashSet;

/*
Write a Java program to iterate through all elements in a hash list
 */
public class Question7 {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(55);
        hashSet.add(67);
        hashSet.add(23);
        hashSet.add(91);
        hashSet.add(43);

        hashSet.forEach(num -> System.out.println(num));

    }
}
