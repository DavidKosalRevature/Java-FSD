package com.revature;

public class Calculation {
    private int a;
    private int b;

    public Calculation(double a, double b){
        this.a = (int)a;
        this.b = (int)b;
        System.out.println("constructor: double, double");
    }

    public Calculation(int a, int b){
        this.a = a;
        this.b = b;
        System.out.println("constructor: int, int");
    }

    public Calculation(String a, String b){
        this.a = Integer.parseInt(a);
        this.b = Integer.parseInt(b);
        System.out.println("Constructor: string, string");
    }



    public void sum(){
        System.out.println("Sum : "+ (this.a + this.b));
    }

    public void sub(){
        System.out.println("Sub : "+ (this.a - this.b));
    }
}
