package com.company;

import java.sql.*;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //Write data you want to insert
        Employee employee = new Employee();
        employee.setName("Stacy");
        employee.setEmail("s@gmail.com");

        //Employee Dao
        EmployeeDAO dao = EmployeeDAOFactory.getEmployeeDao();
        dao.addEmployee(employee);
    }
}
