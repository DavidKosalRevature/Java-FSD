package com.company;

import java.util.Scanner;

public class Account {
    Scanner scan =  new Scanner(System.in);
    Customer customer = new Customer();
    Employee employee = new Employee();

    public void loginMenu() {

        String choice;
        do {
            System.out.println("What would you like to do?");
            System.out.println("1. Login");
            System.out.println("2. Register");
            System.out.println("3. Exit");

            choice = scan.next().toLowerCase();

            switch (choice) {
                case "login":
                    login();
                    break;
                case "register":
                    register();
                    break;
                case "exit":
                    exit();
                    break;
                default:
                    System.out.println("Please make valid choice");
                    loginMenu();
                    break;
            }
        } while (!choice.equals("exit"));
    }

    private void login() {
        System.out.println("Please enter your username: ");
        String username = scan.next();

        System.out.println("Please enter your password: ");
        String password = scan.next();

    }

    private void register() {
        System.out.println("Please enter your first name");
        String firstName = scan.next();

        System.out.println("Please enter your last name");
        String lastName = scan.next();

        System.out.println("Please enter your username: ");
        String username = scan.next();

        System.out.println("Please enter your password: ");
        String password = scan.next();

        //Connect to database here

    }

    private void exit() {
        System.exit(0);
    }




}
