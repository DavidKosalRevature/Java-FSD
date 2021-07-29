package com.company;

import java.util.ArrayList;

/*
Write a Java program to remove the third element from a array list

 */
public class Demo20 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(12);
        arrayList.add(89);
        arrayList.add(35);
        arrayList.add(74);
        arrayList.add(354);
        System.out.println(arrayList);

        arrayList.remove(2);
        System.out.println(arrayList);
    }
}
