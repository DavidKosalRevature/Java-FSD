package com.company;

import java.util.TreeSet;

public class Demo10 {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Mark");
        treeSet.add("Watson");
        treeSet.add("John");
        treeSet.add("Apple");

        for(String name: treeSet){
            System.out.println(name);
        }
    }
}
