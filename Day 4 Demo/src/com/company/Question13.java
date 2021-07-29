package com.company;

import java.util.ArrayList;
import java.util.Collections;

/*
Write a Java program of swap two elements in an array list

 */
public class Question13 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(12);
        arrayList.add(89);
        arrayList.add(35);
        arrayList.add(74);
        arrayList.add(354);
        System.out.println(arrayList);

        Collections.swap(arrayList,0,4);
        System.out.println(arrayList);
    }
}
