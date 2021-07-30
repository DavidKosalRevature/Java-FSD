package com.company;

import java.util.HashSet;
import java.util.LinkedHashSet;

/*
Write a Java program to append the specified element to the end of a hash set
 */
public class Question6 {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new LinkedHashSet<>();
        hashSet.add(55);
        hashSet.add(67);
        hashSet.add(23);
        hashSet.add(91);
        hashSet.add(43);
        System.out.println(hashSet);

        hashSet.add(17);
        System.out.println(hashSet);
    }
}
