package com.company;

class Customer{
    public void display(){
        System.out.println("display");
    }
}

public class Demo21 {
    public static void main(String[] args) {
        String str = "Mark";
        System.out.println(str.length());

        String str2 = null;
        try{
            System.out.println(str2.length());
        } catch(NullPointerException ex){

        }

        Customer customer1 = new Customer();
        customer1.display();

        Customer customer2 = null;
        customer2.display();
    }
}
