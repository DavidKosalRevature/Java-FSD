package com.company;

/*
Write a Java program to create a new array list, add some colors (string) and print out the collection
 */

import java.util.ArrayList;

public class Question1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("red");
        arrayList.add("blue");
        arrayList.add("green");

        System.out.println(arrayList);
    }
}
