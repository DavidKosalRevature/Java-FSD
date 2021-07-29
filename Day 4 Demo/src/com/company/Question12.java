package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
Write a Java program to extract a portion of a array list

 */
public class Question12 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(12);
        arrayList.add(89);
        arrayList.add(35);
        arrayList.add(74);
        arrayList.add(354);
        System.out.println(arrayList);

        List<Integer> arrayList2 = arrayList.subList(2,4);
        System.out.println(arrayList2);
    }
}
