package com.company;

import java.util.TreeSet;

/*
Write a Java program to get the first and last elements in a tree set
 */
public class Question14 {
    public static void main(String[] args) {
        TreeSet<String> colors = new TreeSet<>();
        colors.add("red");
        colors.add("blue");
        colors.add("green");
        colors.add("yellow");
        colors.add("purple");
        System.out.println(colors);

        System.out.println(colors.pollFirst());
        System.out.println(colors.pollLast());
    }
}
