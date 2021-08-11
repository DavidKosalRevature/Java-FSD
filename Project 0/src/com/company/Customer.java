package com.company;

import java.sql.SQLException;
import java.util.Scanner;

public class Customer {
    Scanner scan = new Scanner(System.in);
    String choice;
    UserDAO dao = CustomerDAOFactory.getCustomerDao();
    User user;

    public void customerBankMenu(User user) throws SQLException {
        this.user = user;

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
                    apply(user);
                    break;
                case "view":
                    view(user);
                    break;
                case "deposit":
                    deposit(user);
                    break;
                case "withdraw":
                    withdraw(user);
                    break;
                case "post":
                    postMoney();
                    break;
                case "accept":
                    acceptMoneyTransfer();
                    break;
                case "logout":
                    logout();
                    break;
                default:
                    System.out.println("Please make a valid choice");
                    customerBankMenu(user);
                    break;
            }
        } while(!choice.equals("logout"));
    }

    private void apply(User user) throws SQLException {
        System.out.println("Which bank account would you like?");
        System.out.println("1. Checking");
        System.out.println("2. Savings");

        String bankAccount = scan.next();

        System.out.println("Please Enter starting balance");
        double startingAmount = scan.nextDouble();

        dao.addAccount(user, bankAccount, startingAmount);


        //Request request = new Request(user.getId(), bankAccount, startingAmount);

        //Send request to Employee
//        Employee.requestList.add(request);



    }

    private void view(User user) throws SQLException {
        System.out.println("Here are all your accounts");
        dao.customerAccount(user);


//        System.out.println("Which account would you like to view?");
//        String bankAccount = scan.next();

        //Find balance of list from database
    }

    private void deposit(User user) throws SQLException {
        view(user);

        System.out.println("Select the account ID you like to deposit to");
        int bankAccount = scan.nextInt();

        System.out.println("Select the amount you would like to deposit");
        double amount = scan.nextDouble();

        dao.deposit(bankAccount, amount);
    }

    private void withdraw(User user) throws SQLException {
        view(user);

        System.out.println("Which account would you like to withdraw from?");
        int bankAccount = scan.nextInt();

        System.out.println("Select the amount you would like to withdraw");
        double amount = scan.nextDouble();

        dao.withdraw(bankAccount, amount);

    }

    private void postMoney() {
        System.out.println("Please enter the account number you would like to send money to");
        int sendAccount = scan.nextInt();

        System.out.println("Please enter your account ID that will send the transfer");
        int customerAccount = scan.nextInt();

        System.out.println("Please enter the amount you would like to send");
        double amount = scan.nextDouble();



        //Find bank account
    }

    private void acceptMoneyTransfer() {
        System.out.println("Here are your pending money transfer");

        //Find incoming request
    }

    private void logout() throws SQLException {
        Account account = new Account();
        account.loginMenu();
    }
}
