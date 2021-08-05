package com.company;

import java.util.Scanner;

public class Employee {
    Scanner scan = new Scanner(System.in);
    String choice;
    Account account = new Account();

    public void employeeBankMenu(){

        do {
            System.out.println("Please choose a bank option");
            System.out.println("1. Account Request");
            System.out.println("2. View Customer");
            System.out.println("3. View Log");

            choice = scan.next().toLowerCase();

            switch (choice) {
                case "account request":
                    accountRequest();
                    break;
                case "view customer":
                    viewCustomer();
                    break;
                case "view log":
                    viewLog();
                    break;
                case "logout":
                    logout();
                    break;
                default:
                    System.out.println("Please choose a valid option");
                    break;
            }
        } while (!choice.equals("logout"));
    }

    private void accountRequest() {
        //not sure how to do yet
    }

    private void viewCustomer() {
        //not sure how to do yet
    }

    private void viewLog() {
        //no idea how to log lol
    }

    private void logout() {
        account.loginMenu();
    }
}
