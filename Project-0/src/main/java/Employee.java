import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Employee {
    Customer customer;
    Scanner scan = new Scanner(System.in);
    String choice;
    User user;
    UserDAO dao = UserDAOFactory.getUserDao();

    public void employeeBankMenu(User user) throws SQLException {
        this.user = user;

        do {
            System.out.println("Please choose a bank option");
            System.out.println("1. Account Requests");
            System.out.println("2. View Customer");
            System.out.println("3. View Log");
            System.out.println("4. Log out");

            choice = scan.next().toLowerCase();

            switch (choice) {
                case "account":
                    accountRequest();
                    break;
                case "customer":
                    viewCustomer();
                    break;
                case "log":
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

    private void accountRequest() throws SQLException {
        System.out.println("Here is a list of pending account requests");
        dao.viewRequest();

        System.out.println("Would you like to approve any request?");
        System.out.println("Enter yes to accept");
        String accept = scan.next().toLowerCase();
        if(accept.equals("yes")){
            System.out.println("Enter the Account Request ID you would like to approve");
            int requestId  = scan.nextInt();

        }


    }

    private void viewCustomer() throws SQLException {
        System.out.println("Here is a list of all customers");
        dao.getUser();

        System.out.println("Please choose the user account ID that you would like to view");
        int accountID = scan.nextInt();

        dao.customerAccount(accountID);

    }

    private void viewLog() {
        //no idea how to log lol
    }

    private void logout() throws SQLException {
        Account account = new Account();
        account.loginMenu();
    }
}
