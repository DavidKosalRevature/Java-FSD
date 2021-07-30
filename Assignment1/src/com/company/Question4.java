package com.company;

import java.util.Collections;
import java.util.LinkedList;

/*
Write a Java program to iterate a linked list in reverse order
 */
public class Question4 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(55);
        linkedList.add(67);
        linkedList.add(23);
        linkedList.add(91);
        linkedList.add(43);
        System.out.println(linkedList);

        Collections.reverse(linkedList);
        System.out.println(linkedList);

    }
}
