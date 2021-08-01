package com.company;

import java.util.Objects;
import java.util.Scanner;

class DivideByZeroException extends ArithmeticException {
    public DivideByZeroException() {
        System.out.println("Can't divide by 0");
    }
}

class Calculator {
    static Scanner scan = new Scanner(System.in);
    static double first;
    static double second;

    public double add(double num1, double num2) {
        return num1 + num2;
    }

    public double subtract(double num1, double num2) {
        return num1 - num2;
    }

    public double multiply(double num1, double num2) {
        return num1 * num2;
    }

    public double divide(double num1, double num2) throws DivideByZeroException {
        if (num2 == 0) {
            throw new DivideByZeroException();
        }
        return num1 / num2;
    }

    public void input() {
        String operation = "";

        do {

            System.out.println("Which operation would you like to perform?");
            System.out.println("Add");
            System.out.println("Subtract");
            System.out.println("Multiply");
            System.out.println("Divide");
            System.out.println("Exit");

            operation = scan.next();

            switch (operation) {
                case "add":
                    numInput();
                    System.out.println(first + " + " + second + " is " + add(first, second));
                    break;
                case "subtract":
                    numInput();
                    System.out.println(first + " - " + second + " is " + subtract(first, second));
                    break;
                case "multiply":
                    numInput();
                    System.out.println(first + " * " + second + " is " + multiply(first, second));
                    break;
                case "divide":
                    numInput();
                    System.out.println(first + " / " + second + " is " + divide(first, second));
                    break;
                case "exit":
                    System.exit(0);
                    break;
                default:
                    System.out.println("not a valid operation");
                    break;

            }
        } while (!Objects.equals(operation, "exit"));

    }

    public static void numInput() {
        System.out.println("Enter first number: ");
        first = scan.nextDouble();

        System.out.println("Enter second number: ");
        second = scan.nextDouble();
    }

}

public class Main {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        calculator.input();


    }
}
