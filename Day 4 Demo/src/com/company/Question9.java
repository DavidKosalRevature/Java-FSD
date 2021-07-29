package com.company;

import java.util.ArrayList;

/*
Write a Java program to copy one array list into another

 */
public class Question9 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(12);
        arrayList.add(89);
        arrayList.add(35);
        arrayList.add(74);
        arrayList.add(354);
        System.out.println(arrayList);

        ArrayList<Integer> arrayList2 = new ArrayList<>();
        arrayList2.add(43);
        arrayList2.add(97);
        System.out.println(arrayList2);

        arrayList2.addAll(arrayList);
        System.out.println(arrayList2);
    }
}
