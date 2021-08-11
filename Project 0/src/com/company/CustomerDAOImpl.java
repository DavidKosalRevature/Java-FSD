package com.company;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CustomerDAOImpl implements UserDAO {
    Connection connection = null;

    public CustomerDAOImpl() {
        try {
            this.connection = ConnectionFactory.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void addUser(User user) throws SQLException {
        String sql = "insert into user (accountType, firstName, lastName, email, username, password) " +
                "values (?,?,?,?,?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, user.getAccountType());
        preparedStatement.setString(2, user.getFirstName());
        preparedStatement.setString(3, user.getLastName());
        preparedStatement.setString(4, user.getEmail());
        preparedStatement.setString(5, user.getUsername());
        preparedStatement.setString(6, user.getPassword());
        int count = preparedStatement.executeUpdate();
        if(count > 0)
            System.out.println("You have successfully registered for a " +
                    user.getAccountType() + " account");
        else
            System.out.println("something went wrong");
    }

    @Override
    public void addAccount(User user, String account, double balance) throws SQLException{
        String sql = "insert into bankaccount (userId, accountType, balance) values (?,?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1,user.getId());
        preparedStatement.setString(2, account);
        preparedStatement.setDouble(3, balance);
        int count = preparedStatement.executeUpdate();
        if(count > 0)
            System.out.println("You have successfully registered for a " +
                    account + " account + with $" + balance);
        else
            System.out.println("something went wrong");
    }

    @Override
    public boolean checkLogin(String username, String password) throws SQLException{
        String usernameCheck = "select * from user where username = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(usernameCheck);
        preparedStatement.setString(1,username);
        ResultSet resultSet = preparedStatement.executeQuery();

        if(resultSet.next()){
            String passwordCheck = "select * from user where password = ?";
            PreparedStatement preparedStatement2 = connection.prepareStatement(passwordCheck);
            preparedStatement2.setString(1, password);
            ResultSet resultSet2 = preparedStatement2.executeQuery();

            if(resultSet2.next()){
                return true;
            } else{
                return false;
            }
        } else {
            return false;
        }
    }

    @Override
    public void customerAccount(User user) throws SQLException {
        String sql = "select * from bankaccount where userId = " + user.getId();
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ResultSet resultSet = preparedStatement.executeQuery();

        while(resultSet.next()){
            System.out.println("Account Id: " + resultSet.getString("accountId") +
                    " " + resultSet.getString("accountType") + " " +
                    resultSet.getString("balance"));
        }
    }

    @Override
    public void customerAccount(int id) throws SQLException {
        String sql = "select * from bankaccount where userId = " + id;
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ResultSet resultSet = preparedStatement.executeQuery();

        while(resultSet.next()){
            System.out.println("Bank Account Id: " + resultSet.getString("accountId") +
                    ", " + resultSet.getString("accountType") + "= " +
                    resultSet.getString("balance"));
        }
    }


    @Override
    public void deposit(int id, double amount) throws SQLException{
        String sql =  "select * from bankaccount where accountId  = " + id;
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ResultSet resultSet = preparedStatement.executeQuery();

        if(resultSet.next()){
            String sql2 = "update bankaccount set balance = ? where accountId = ?";
            PreparedStatement preparedStatement2 = connection.prepareStatement(sql2);

            double newBalance = amount + resultSet.getDouble("balance");
            preparedStatement2.setDouble(1, newBalance);
            preparedStatement2.setInt(2, id);
            int count = preparedStatement2.executeUpdate();
            if(count > 0) {
                System.out.println(amount + " has been deposited in your account");
                System.out.println(newBalance + " is your updated balance");
            }
            else
                System.out.println("something went wrong");

        }

    }

    @Override
    public void withdraw(int id, double amount) throws SQLException{
        String sql =  "select * from bankaccount where accountId  = " + id;
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ResultSet resultSet = preparedStatement.executeQuery();

        if(resultSet.next()){
            String sql2 = "update bankaccount set balance = ? where accountId = ?";
            PreparedStatement preparedStatement2 = connection.prepareStatement(sql2);

            double newBalance = resultSet.getDouble("balance");
            if((newBalance - amount) > 0){
                newBalance -= amount;
                preparedStatement2.setDouble(1, newBalance);
                preparedStatement2.setInt(2, id);
                int count = preparedStatement2.executeUpdate();
                if(count > 0) {
                    System.out.println(amount + " has been withdrawed in your account");
                    System.out.println(newBalance + " is your updated balance");
                }
                else
                    System.out.println("something went wrong");

                }
            } else{
            System.out.println("You cannot withdraw more than what is available in your account");
        }

    }

    public void sendTransfer(int sendId, int receiveId, double amount) throws SQLException {
        String sql = "insert into transfer (sendId, receivedId, amount) values (?,?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1,sendId);
        preparedStatement.setInt(2,receiveId);
        preparedStatement.setDouble(3,amount);
        int count = preparedStatement.executeUpdate();
        if(count > 0)
            System.out.println("Your transfer has been sent");
        else
            System.out.println("something went wrong");

    }

    @Override
    public void updateUser(User user) throws SQLException {
        String sql = "update customer set firstName = ?, lastName = ?, email = ? where id = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, user.getFirstName());
        preparedStatement.setString(2, user.getLastName());
        preparedStatement.setString(3, user.getEmail());
        preparedStatement.setInt(4, user.getId());
        int count = preparedStatement.executeUpdate();
        if(count > 0)
            System.out.println("customer saved");
        else
            System.out.println("something went wrong");

    }

    @Override
    public void deleteUser(int id) throws SQLException {
        String sql = "delete from customer where id = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, id);
        int count = preparedStatement.executeUpdate();
        if(count > 0)
            System.out.println("customer saved");
        else
            System.out.println("something went wrong");
    }

    @Override
    public void getUser() throws SQLException {
        String sql = "select * from user where accountType = \"customer\"";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ResultSet resultSet = preparedStatement.executeQuery();

        while(resultSet.next()){
            System.out.println("Account Id: " + resultSet.getInt("id"));
            System.out.println(resultSet.getString("firstName"));
            System.out.println(resultSet.getString("lastName"));
            System.out.println(resultSet.getString("email"));
            System.out.println();

        }

    }

    @Override
    public User userByUsername(String username) throws SQLException {
        User user = new User();
        String usernameCheck = "select * from user where username = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(usernameCheck);
        preparedStatement.setString(1,username);
        ResultSet resultSet = preparedStatement.executeQuery();

        if(resultSet.next()) {
            user.setId(resultSet.getInt(1));
            user.setAccountType(resultSet.getString(2));
            user.setFirstName(resultSet.getString(3));
            user.setLastName(resultSet.getString(4));
            user.setEmail(resultSet.getString(5));
            user.setUsername(resultSet.getString(6));
            user.setPassword(resultSet.getString(7));
        }
        return user;

    }
}
