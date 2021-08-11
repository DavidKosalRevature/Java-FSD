package com.company;

import java.sql.SQLException;

public interface UserDAO {
    void addUser(User user) throws SQLException;
    boolean checkLogin(String username, String password) throws SQLException;
    void addAccount(User user, String account, double balance) throws SQLException;
    void customerAccount(User user) throws SQLException;

    void customerAccount(int id) throws SQLException;

    void deposit(int id, double amount) throws SQLException;

    void withdraw(int id, double amount) throws SQLException;

    void updateUser(User user) throws SQLException;
    void deleteUser(int id) throws SQLException;
    void getUser() throws SQLException;
    User userByUsername(String username) throws SQLException;
}
