package com.company;

import java.util.Scanner;

public class Customer {
    Scanner scan = new Scanner(System.in);
    String choice;
    Account account = new Account();

    public void customerBankMenu(){

        do{
            System.out.println("Please choose a bank option");
            System.out.println("1. Apply for a new bank account");
            System.out.println("2. View Balance");
            System.out.println("3. Deposit");
            System.out.println("4. Withdraw");
            System.out.println("5. Post Money Transfer");
            System.out.println("6. Accept Money Transfer");
            System.out.println("7. Logout");

            choice = scan.next().toLowerCase();

            switch (choice){
                case "apply":
                    apply();
                    break;
                case "view balance":
                    view();
                    break;
                case "deposit":
                    deposit();
                    break;
                case "withdraw":
                    withdraw();
                    break;
                case "post money transfer":
                    postMoney();
                    break;
                case "accept money transfer":
                    acceptMoneyTransfer();
                    break;
                case "logout":
                    logout();
                    break;
                default:
                    System.out.println("Please make a valid choice");
                    customerBankMenu();
                    break;
            }
        } while(!choice.equals("logout"));
    }

    private void apply() {
        System.out.println("Which bank account would you like?");
        System.out.println("1. Checking");
        System.out.println("2. Savings");

        String bankAccount = scan.next();

        System.out.println("Please Enter starting balance");
        double startingAmount = scan.nextDouble();

        //Send request to Employee


    }

    private void view() {
        System.out.println("Which account would you like to view?");
        String bankAccount = scan.next();

        //Find balance of list from database
    }

    private void deposit() {
        System.out.println("Which account would you like to deposit to?");
        String bankAccount = scan.next();

        //Find bank account
    }

    private void withdraw() {
        System.out.println("Which account would you like to withdraw from?");
        String bankAccount = scan.next();

        //Find bank account
    }

    private void postMoney() {
        System.out.println("Please enter the account number you would like to send money to");
        String bankAccount = scan.next();

        //Find bank account
    }

    private void acceptMoneyTransfer() {
        System.out.println("Here are your pending money transfer");

        //Find incoming request
    }

    private void logout() {
        account.loginMenu();
    }
}
