package com.company;

import java.util.ArrayList;

/*
 Write a Java program to search an element in a array list

 */
public class Demo21 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(12);
        arrayList.add(89);
        arrayList.add(35);
        arrayList.add(74);
        arrayList.add(354);
        System.out.println(arrayList);

        System.out.println(arrayList.contains(74));
    }
}
