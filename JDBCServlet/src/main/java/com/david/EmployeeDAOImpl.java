package com.david;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAOImpl implements EmployeeDAO{
    Connection connection = null;

    public EmployeeDAOImpl() {
        try {
            this.connection = ConnectionFactory.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void addEmployee(Employee employee) throws SQLException {
        String sql = "insert into employee (name, email, gender, country) values (?,?,?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, employee.getName());
        preparedStatement.setString(2, employee.getEmail());
        preparedStatement.setString(3, employee.getGender());
        preparedStatement.setString(4, employee.getCountry());
        int count = preparedStatement.executeUpdate();
        if(count > 0)
            System.out.println("employee added");
        else
            System.out.println("something went wrong");
    }

    @Override
    public void updateEmployee(Employee employee) throws SQLException {
        String sql = "update employee set name = ?, email = ?, gender = ?, country = ? where id = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1,employee.getName());
        preparedStatement.setString(2, employee.getEmail());
        preparedStatement.setString(3, employee.getGender());
        preparedStatement.setString(4, employee.getCountry());
        preparedStatement.setInt(5, employee.getId());
        int count = preparedStatement.executeUpdate();
        if(count > 0)
            System.out.println("employee updated");
        else
            System.out.println("something went wrong");

    }

    @Override
    public void deleteEmployee(int id) throws SQLException {
        String sql = "delete from employee where id = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, id);
        int count = preparedStatement.executeUpdate();
        if(count > 0)
            System.out.println("employee deleted");
        else
            System.out.println("something went wrong");
    }

    @Override
    public List<Employee> getEmployees() throws SQLException {
        List<Employee> list = new ArrayList<>();
        String sql = "select * from employee";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ResultSet resultSet = preparedStatement.executeQuery(sql);

        while(resultSet.next()){
            Employee newEmployee = new Employee();
            newEmployee.setId(resultSet.getInt(1));
            newEmployee.setName(resultSet.getString(2));
            newEmployee.setEmail(resultSet.getString(3));
            newEmployee.setGender(resultSet.getString(4));
            newEmployee.setCountry(resultSet.getString(5));
            list.add(newEmployee);
        }


        return list;
    }

    @Override
    public Employee employeeById(int id) throws SQLException {
        Employee employee = new Employee();
        String sql = "select * from employee where id = " + String.valueOf(id);
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ResultSet resultSet = preparedStatement.executeQuery(sql);

        if(resultSet.next()) {
            employee.setId(resultSet.getInt(1));
            employee.setName(resultSet.getString(2));
            employee.setEmail(resultSet.getString(3));
        }
        return employee;

    }
}
