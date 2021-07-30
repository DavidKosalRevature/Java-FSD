package com.company;

import java.util.TreeSet;

/*
Write a Java program to add all the elements of a specified tree set to another tree set
 */
public class Question12 {
    public static void main(String[] args) {
        TreeSet<String> colors = new TreeSet<>();
        colors.add("red");
        colors.add("blue");
        colors.add("green");
        colors.add("yellow");
        colors.add("purple");
        System.out.println(colors);

        TreeSet<String> colors2 = new TreeSet<>();
        colors2.add("magenta");
        colors2.add("cyan");
        System.out.println(colors2);

        colors.addAll(colors2);
        System.out.println(colors);

    }
}
