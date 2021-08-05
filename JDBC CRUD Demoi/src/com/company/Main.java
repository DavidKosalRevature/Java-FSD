package com.company;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //Write data you want to insert
        Employee employee = new Employee();
        employee.setName("Stacy");
        employee.setEmail("s@gmail.com");

        Employee employee2 = new Employee();

        //Employee Dao
        EmployeeDAO dao = EmployeeDAOFactory.getEmployeeDao();

        Scanner scanner = new Scanner(System.in);
        int choice;
        boolean flag = true;

        while(flag) {

            System.out.println("Please choose an option");
            System.out.println("1.Add an employee");
            System.out.println("2.Update an employee");
            System.out.println("3.Delete an employee");
            System.out.println("4.Get all employee");
            System.out.println("5.Get an employee by id");
            System.out.println("6.Exit");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter your name");
                    String name = scanner.next();
                    System.out.println("Enter your email");
                    String email = scanner.next();

                    employee2.setName(name);
                    employee2.setEmail(email);
                    dao.addEmployee(employee2);
                    break;
                case 2:
                    System.out.println("Enter the new name");
                    String newName = scanner.next();
                    System.out.println("Enter the new email");
                    String newEmail = scanner.next();

                    System.out.println("Enter the id of the employee");
                    int findId = scanner.nextInt();
                    Employee foundEmployee = dao.employeeById(findId);

                    foundEmployee.setName(newName);
                    foundEmployee.setEmail(newEmail);
                    dao.updateEmployee(foundEmployee);
                    break;
                case 3:
                    System.out.println("Enter the id of the employee");
                    int deleteId = scanner.nextInt();
                    dao.deleteEmployee(deleteId);
                    break;
                case 4:
                    List<Employee> list = dao.getEmployees();
                    for (Employee e : list) {
                        System.out.println("id: " + e.getId());
                        System.out.println("name: " + e.getName());
                        System.out.println("email: " + e.getEmail());
                        System.out.println();
                    }
                case 5:
                    System.out.println("Enter the id of the employee");
                    int searchId = scanner.nextInt();
                    Employee searchEmployee = dao.employeeById(searchId);
                    System.out.println("id: " + searchEmployee.getId());
                    System.out.println("name: " + searchEmployee.getName());
                    System.out.println("email: " + searchEmployee.getEmail());
                case 6:
                    System.out.println("Exit");
                    flag = false;

            }
        }
    }
}
