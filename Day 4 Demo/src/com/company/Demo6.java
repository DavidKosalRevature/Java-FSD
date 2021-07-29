package com.company;

import java.util.ArrayList;

public class Demo6 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Mark");
        names.add("Paul");
        names.add("Stacy");
        names.add("Watson");
        System.out.println(names);

        //getting element on a specified index
        System.out.println(names.get(1));

        //add the element on a specified index
        names.add(1, "John");
        System.out.println(names);

        // merge two list
        ArrayList<String> newNames = new ArrayList<>();
        newNames.add("A");
        newNames.add("B");

        //names.addAll(newNames);

        //adding second list element to the specified position
        names.addAll(0, newNames);

        System.out.println(names);

        // remove
        names.remove("Mark");
        System.out.println(names);

//        names.removeAll(newNames);
//        System.out.println(names);

        // contain
        names.removeIf(name -> name.contains("Paul"));
        System.out.println(names);
    }
}
