package com.company;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAOImpl implements UserDAO {
    private static Statement statement = null;
    Connection connection = null;

    public EmployeeDAOImpl() {
        try {
            this.connection = ConnectionFactory.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void addUser(User user) throws SQLException {
        String sql = "insert into employee (firstName, lastName, email, username, password) values (?,?,?,?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, user.getFirstName());
        preparedStatement.setString(2, user.getLastName());
        preparedStatement.setString(3, user.getEmail());
        preparedStatement.setString(4, user.getUsername());
        preparedStatement.setString(5, user.getPassword());
        int count = preparedStatement.executeUpdate();
        if(count > 0)
            System.out.println("You have successfully registered for an employee account");
        else
            System.out.println("something went wrong");
    }

    @Override
    public boolean checkLogin(String username, String password) throws SQLException{
        String usernameCheck = "select * from employee where username = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(usernameCheck);
        preparedStatement.setString(1,username);
        ResultSet resultSet = preparedStatement.executeQuery();

        if(resultSet.next()){
            String passwordCheck = "select * from employee where password = ?";
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
    public void addAccount(User user, String account, double balance) throws SQLException {

    }

    @Override
    public void customerAccount(User user) throws SQLException {

    }

    @Override
    public void deposit(int id, double amount) throws SQLException {

    }

    @Override
    public void withdraw(int id, double amount) throws SQLException {

    }

    @Override
    public void updateUser(User user) throws SQLException {
        String sql = "update employee set firstName = ?, lastName = ?, email = ? where id = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, user.getFirstName());
        preparedStatement.setString(2, user.getLastName());
        preparedStatement.setString(3, user.getEmail());
        preparedStatement.setInt(4, user.getId());
        int count = preparedStatement.executeUpdate();
        if(count > 0)
            System.out.println("employee saved");
        else
            System.out.println("something went wrong");

    }

    @Override
    public void deleteUser(int id) throws SQLException {
        String sql = "delete from employee where id = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, id);
        int count = preparedStatement.executeUpdate();
        if(count > 0)
            System.out.println("employee saved");
        else
            System.out.println("something went wrong");
    }

    @Override
    public List<User> getUser() throws SQLException {
        List<User> list = new ArrayList<>();
        String sql = "select * from employee";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ResultSet resultSet = preparedStatement.executeQuery(sql);

        while(resultSet.next()){
            User newUser = new User();
            newUser.setId(resultSet.getInt(1));
            newUser.setFirstName(resultSet.getString(2));
            newUser.setLastName(resultSet.getString(3));
            newUser.setEmail(resultSet.getString(4));
            newUser.setUsername(resultSet.getString(5));
            newUser.setPassword(resultSet.getString(6));
            list.add(newUser);
        }


        return list;
    }

    @Override
    public User userByUsername(String username) throws SQLException {
        User user = new User();
        String usernameCheck = "select * from employee where username = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(usernameCheck);
        preparedStatement.setString(1,username);
        ResultSet resultSet = preparedStatement.executeQuery();

        if(resultSet.next()) {
            user.setId(resultSet.getInt(1));
            user.setFirstName(resultSet.getString(2));
            user.setLastName(resultSet.getString(3));
            user.setEmail(resultSet.getString(4));
            user.setUsername(resultSet.getString(5));
            user.setPassword(resultSet.getString(6));
        }
        return user;

    }
}
