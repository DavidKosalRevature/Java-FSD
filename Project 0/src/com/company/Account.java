package com.company;

import java.sql.SQLException;
import java.util.Objects;
import java.util.Scanner;

public class Account {
    Scanner scan =  new Scanner(System.in);
    UserDAO customerDAO = CustomerDAOFactory.getCustomerDao();
    UserDAO employeeDAO = EmployeeDAOFactory.getEmployeeDao();

    public void loginMenu() throws SQLException {

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

    private void login() throws SQLException {
        Customer customer = new Customer();
        Employee employee = new Employee();

        System.out.println("Please enter your username: ");
        String username = scan.next();

        System.out.println("Please enter your password: ");
        String password = scan.next();

        if(customerDAO.checkLogin(username, password)){
            User user = new User();
            user = customerDAO.userByUsername(username);

            if(Objects.equals(user.getAccountType(), "customer"))
                customer.customerBankMenu(user);
            else
                employee.employeeBankMenu(user);
        }

    }

    private void register() throws SQLException {


        System.out.println("Please choose an account type: ");
        System.out.println("1. Customer");
        System.out.println("2. Employee");
        String accountType = scan.next().toLowerCase();

        accountInput(accountType);


    }

    public void accountInput(String accountType) throws SQLException {
        User user = new User();
        System.out.println("Please enter your first name");
        String firstName = scan.next();
        user.setFirstName(firstName);

        System.out.println("Please enter your last name");
        String lastName = scan.next();
        user.setLastName(lastName);

        System.out.println("Please enter your email");
        String email = scan.next();
        user.setEmail(email);

        System.out.println("Please enter your username: ");
        String username = scan.next();
        user.setUsername(username);

        System.out.println("Please enter your password: ");
        String password = scan.next();
        user.setPassword(password);

        switch(accountType){
            case "customer":
                user.setAccountType(accountType);
                customerDAO.addUser(user);
                break;
            case "employee":
                user.setAccountType(accountType);
                customerDAO.addUser(user);
                break;
        }

    }

    private void exit() {
        System.exit(0);
    }




}
