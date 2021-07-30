package com.company;

import java.util.TreeSet;

/*
Write a Java program to create a new tree set, add some colors (string) and print out the tree set
 */
public class Question10 {
    public static void main(String[] args) {
        TreeSet<String> colors = new TreeSet<>();
        colors.add("red");
        colors.add("blue");
        colors.add("green");
        colors.add("yellow");
        colors.add("purple");

        System.out.println(colors);
    }
}
