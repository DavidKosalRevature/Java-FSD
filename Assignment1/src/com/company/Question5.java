package com.company;

import java.util.LinkedList;

/*
Write a Java program to insert the specified element at the specified position in the linked list
 */
public class Question5 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(55);
        linkedList.add(67);
        linkedList.add(23);
        linkedList.add(91);
        linkedList.add(43);
        System.out.println(linkedList);

        linkedList.add(3, 17);
        System.out.println(linkedList);
    }
}
