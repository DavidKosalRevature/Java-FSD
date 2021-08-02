package com.company;

class Car{
    Engine engine;
    Tire tire;

    public Car(Engine engine, Tire tire){
        this.engine = engine;
        this.tire = tire;
    }
}

class Engine{
    public Engine(String type){

    }
}

class Tire{

}

class CarFactory2{
    public static void getInstance(int id){
        switch (id){
            case 0:
                System.out.println("");
                break;
            case 1:
                System.out.println("");
                break;
        }
    }
}

public class Demo7 {
    public static void main(String[] args) {

    }
}
