package com.company;

import java.util.ArrayList;

/*
Write a Java program to iterate through all elements in a array list

 */
public class Demo16 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(12);
        arrayList.add(89);
        arrayList.add(35);
        arrayList.add(74);
        arrayList.add(354);

        arrayList.forEach(num -> System.out.println(num));
    }
}
