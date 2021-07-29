package com.company;

import java.util.ArrayList;
import java.util.Collections;

/*
Write a Java program to reverse elements in a array list

 */
public class Question11 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(12);
        arrayList.add(89);
        arrayList.add(35);
        arrayList.add(74);
        arrayList.add(354);
        System.out.println(arrayList);

        Collections.reverse(arrayList);
        System.out.println(arrayList);
    }
}
