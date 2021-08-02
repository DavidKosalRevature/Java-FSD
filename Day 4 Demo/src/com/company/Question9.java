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
        System.out.println(arrayList.size());
        arrayList.add(26);
        System.out.println(arrayList.get(5));

        ArrayList<Integer> arrayList2 = new ArrayList<>();
        arrayList2.add(43);
        arrayList2.add(97);
        System.out.println(arrayList2);

        arrayList2.addAll(arrayList);
        System.out.println(arrayList);
        System.out.println(arrayList2);

        int[] array = {1,2,4};

        System.out.println(array.length);

    }
}
