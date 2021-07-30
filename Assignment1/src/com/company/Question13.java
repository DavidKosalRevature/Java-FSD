package com.company;

import java.util.Collections;
import java.util.TreeSet;

/*
Write a Java program to create a reverse order view of the elements contained in a given tree set
 */
public class Question13 {
    public static void main(String[] args) {
        TreeSet<String> colors = new TreeSet<>();
        colors.add("red");
        colors.add("blue");
        colors.add("green");
        colors.add("yellow");
        colors.add("purple");
        System.out.println(colors);

        System.out.println(colors.descendingSet());
    }
}
