package com.company;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Employee {
    Scanner scan = new Scanner(System.in);
    String choice;
    User user;
    UserDAO dao = EmployeeDAOFactory.getEmployeeDao();
    static List<Request> requestList = new ArrayList<>();

    public void employeeBankMenu(User user) throws SQLException {
        this.user = user;

        do {
            System.out.println("Please choose a bank option");
            System.out.println("1. Account Requests");
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
//        if(requestList.isEmpty())
//            System.out.println("There are no requests");
//
//        requestList.forEach(request -> System.out.println(request.toString()));
//        System.out.println("Please pick a request");
//        String request = scan.next();


    }

    private void viewCustomer() {
        //not sure how to do yet
    }

    private void viewLog() {
        //no idea how to log lol
    }

    private void logout() throws SQLException {
        Account account = new Account();
        account.loginMenu();
    }
}
