package com.company;

import java.util.TreeSet;

/*
 Write a Java program to iterate through all elements in a tree set
 */
public class Question11 {
    public static void main(String[] args) {
        TreeSet<String> colors = new TreeSet<>();
        colors.add("red");
        colors.add("blue");
        colors.add("green");
        colors.add("yellow");
        colors.add("purple");

        colors.forEach(color -> System.out.println(color));
    }
}
