package com.company;

import java.util.LinkedList;

/*
Write a Java program to append the specified element to the end of a linked list
 */
public class Question1 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(55);
        linkedList.add(67);
        linkedList.add(23);
        linkedList.add(91);
        linkedList.add(43);
        System.out.println(linkedList);

        linkedList.offerLast(32);
        System.out.println(linkedList);

    }
}
