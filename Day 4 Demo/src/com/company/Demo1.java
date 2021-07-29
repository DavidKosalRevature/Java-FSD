package com.company;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("paul");
        list.add("amelia");
        list.add("calli");

        System.out.println(list);

        //hasNext() will check if iterator has the element
        Iterator iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next()); // print the element and move the cursor to the next
        }

        // foreach
        for(String name : list){
            System.out.println(name);
        }
    }
}
