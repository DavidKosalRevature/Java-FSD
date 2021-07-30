package com.company;

import java.util.LinkedList;

/*
Write a Java program to iterate through all elements in a linked list
 */
public class Question2 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(55);
        linkedList.add(67);
        linkedList.add(23);
        linkedList.add(91);
        linkedList.add(43);

        linkedList.forEach(num -> System.out.println(num));
    }
}
