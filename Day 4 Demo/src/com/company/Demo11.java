package com.company;

import java.util.TreeSet;

public class Demo11 {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(65);
        set.add(21);
        set.add(11);
        set.add(2);
        set.add(15);

        for(int number : set){
            System.out.println(number);
        }

        System.out.println("Highest: " + set.pollFirst());
        System.out.println("Lowest: " + set.pollLast());
    }
}
