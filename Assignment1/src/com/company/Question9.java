package com.company;

import java.util.Collections;
import java.util.HashSet;

/*
Write a Java program to empty an hash set
 */
public class Question9 {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(55);
        hashSet.add(67);
        hashSet.add(23);
        hashSet.add(91);
        hashSet.add(43);
        System.out.println(hashSet);

        hashSet.clear();
        System.out.println(hashSet);
    }
}
