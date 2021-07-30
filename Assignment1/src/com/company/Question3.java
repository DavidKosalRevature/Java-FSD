package com.company;

import java.util.LinkedList;

/*
Write a Java program to iterate through all elements in a linked list starting at the specified position
 */
public class Question3 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(55);
        linkedList.add(67);
        linkedList.add(23);
        linkedList.add(91);
        linkedList.add(43);



        for (int i = linkedList.indexOf(67); i < linkedList.size(); i++) {
            System.out.println(linkedList.get(i));
        }
    }
}
