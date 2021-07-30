package com.company;

import java.util.HashSet;

/*
Write a Java program to get the number of elements in a hash set
 */
public class Question8 {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(55);
        hashSet.add(67);
        hashSet.add(23);
        hashSet.add(91);
        hashSet.add(43);

        System.out.println(hashSet.size());
    }
}
