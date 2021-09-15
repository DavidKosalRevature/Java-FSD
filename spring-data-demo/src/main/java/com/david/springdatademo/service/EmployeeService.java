package com.david.springdatademo.service;

import com.david.springdatademo.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmployeeService {
    Employee saveEmployee(Employee employee);
    List<Employee> getAllEmployees();
    Employee getEmployeeById(long empId);
    void deleteEmployee(long empId);

    Employee updateEmployee(long empId, Employee employee);
}
