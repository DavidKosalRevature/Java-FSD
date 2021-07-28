package com.company;

public class Demo19 {
    public static void main(String[] args) {
        try{
            doSomething();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    private static void doSomething() throws Exception {
        doSomethingElse();
    }

    private static void doSomethingElse() throws Exception {
        doSomethingSomethingElse();
    }

    private static void doSomethingSomethingElse() throws Exception {
        throw new Exception();
    }
}
