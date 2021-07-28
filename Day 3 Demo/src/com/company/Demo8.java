package com.company;

import java.util.Arrays;

public class Demo8 {
    public static void main(String[] args) {
        String message = "Hello, welcome to Java";
        String[] result = message.split("\\,");
        System.out.println(Arrays.toString(result));
    }
}
