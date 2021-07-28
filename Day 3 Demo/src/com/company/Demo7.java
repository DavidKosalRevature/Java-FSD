package com.company;

public class Demo7 {
    public static void main(String[] args) {
        String message = "Welcome to Java Training";
        System.out.println(message.substring(0, 7)); //

        System.out.println("Original Message: " + message);
        System.out.println("Substring starting from index 7: " + message.substring(7));
        System.out.println("Substring starting from index 0 to 7: " + message.substring(0,7));

        String str = new String("Welcome Home");
        System.out.println(str.substring(5));

    }
}
