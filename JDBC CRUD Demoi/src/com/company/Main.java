package com.company;

import java.sql.*;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        //Step 1: load the driver
        //Class.forName("com.mysql.jbdc.Driver");

        //Step 2: Create connection
        String host = "jdbc:mysql://localhost:3306/";
        String database = "revature";
        //jdbc:mysql://localhost:3306/revature
        String connectionString = host + database;
        String username = "root";
        String password = "root";

        Connection conn = DriverManager.getConnection(connectionString, username, password);

        // Step 3: Create Statement object;
        Statement statement = conn.createStatement();

        // Step 4: Execute Queries


        // Demo 1 : Create a table
//        String query = "create table employee (id INTEGER PRIMARY KEY AUTO_INCREMENT, name CHAR(20), email CHAR(50))";
//        statement.executeUpdate(query);
//        System.out.println("table created successfully");

//        //Demo 2 : Insert data into our table
//        String query = "insert into employee (name, email) values (?, ?)";
//
//        // Get PrepareStatement object
//        PreparedStatement preparedStatement = conn.prepareStatement(query);
//        // Set the values to query
//        preparedStatement.setString(1, "Mark Smith");
//        preparedStatement.setString(2, "m@gmail.com");
//        //execute the query
//        int rowAffected = preparedStatement.executeUpdate();
//        System.out.println("(" + rowAffected + ") rows affected");

//        //Demo 3: Update data of our table
//        String query = "update employee set name = ?, email = ? where id = ?";
//        PreparedStatement preparedStatement = conn.prepareStatement(query);
//        preparedStatement.setString(1, "Paul");
//        preparedStatement.setString(2, "p@gmail.com");
//        preparedStatement.setInt(3,1);
//        int rowAffected = preparedStatement.executeUpdate();
//        System.out.println("(" + rowAffected + ") rows affected");



        // Demo 4: Delete data from our table
        String query = "delete from employee where id = ?";
        PreparedStatement preparedStatement = conn.prepareStatement(query);
        preparedStatement.setInt(1,1);
        int rowAffected = preparedStatement.executeUpdate();
        System.out.println("(" + rowAffected + ") rows affected");

        //Step 5: Close connection
        if(conn.isClosed()){
            System.out.println("Connection closed");
        }else {
            System.out.println("Connection opened");
        }
    }
}
