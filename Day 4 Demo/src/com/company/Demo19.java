package com.company;

import java.util.ArrayList;

/*
Write a Java program to update specific array element by given element

 */
public class Demo19 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(12);
        arrayList.add(89);
        arrayList.add(35);
        arrayList.add(74);
        arrayList.add(354);
        System.out.println(arrayList);

        arrayList.set(2, 1);
        System.out.println(arrayList);
    }
}
