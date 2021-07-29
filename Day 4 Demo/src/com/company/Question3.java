package com.company;

import java.util.ArrayList;

/*
Write a Java program to insert an element into the array list at the first position

 */
public class Question3 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(12);
        arrayList.add(89);
        arrayList.add(35);
        arrayList.add(74);
        arrayList.add(354);
        System.out.println(arrayList);

        arrayList.add(0, 999);
        System.out.println(arrayList);

    }
}
