package main.java;

import java.sql.SQLException;
import java.util.Scanner;

public class Customer {
    Scanner scan = new Scanner(System.in);
    String choice;
    UserDAO dao = UserDAOFactory.getUserDao();
    User user;

    public void customerBankMenu(User user) throws SQLException {
        this.user = user;
        System.out.println("Current user logged in: " + user.getUsername());

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
                    postMoney(user);
                    break;
                case "accept":
                    acceptMoneyTransfer(user);
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

        dao.requestAccount(user.getId(),bankAccount,startingAmount);

    }

    private void view(User user) throws SQLException {
        System.out.println("Here are all your accounts");
        dao.customerAccount(user);
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

    private void postMoney(User user) throws SQLException {
        System.out.println("Please enter the account number you would like to send money to");
        int sendAccount = scan.nextInt();

        System.out.println("Please enter your account ID that will send the transfer");
        dao.customerAccount(user);
        int customerAccount = scan.nextInt();

        System.out.println("Please enter the amount you would like to send");
        double amount = scan.nextDouble();

        dao.sendTransfer(sendAccount, customerAccount, amount);
        dao.withdraw(customerAccount,amount);

    }

    private void acceptMoneyTransfer(User user) throws SQLException {
        System.out.println("Here are your pending money transfer");

        if(dao.viewTransfer(user.getId())) {

            System.out.println("Would you like to accept any transfer?");
            System.out.println("Enter yes to accept");
            String accept = scan.next().toLowerCase();
            if (accept.equals("yes")) {
                System.out.println("Enter the Transfer Request ID you would like to accept");
                int transferID = scan.nextInt();
                dao.acceptTransfer(transferID);

            }
        }
    }

    private void logout() throws SQLException {
        user = null;
        Account account = new Account();
        account.loginMenu();
    }
}
