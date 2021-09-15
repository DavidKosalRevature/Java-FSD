package com.david.springdatademo.service;

import com.david.springdatademo.entity.Employee;
import com.david.springdatademo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService{
    @Autowired
    private EmployeeRepository repository;

    @Override
    public Employee saveEmployee(Employee employee) {
        return repository.save(employee);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return repository.findAll();
    }

    @Override
    public Employee getEmployeeById(long empId) {
        Optional<Employee> employee = repository.findById(empId);
        if(!employee.isPresent()){

        }
        return employee.get();
    }

    @Override
    public void deleteEmployee(long empId) {
        Employee employeeDB = repository.findById(empId).get();
        repository.deleteById(empId);
    }

    @Override
    public Employee updateEmployee(long empId, Employee employee) {
        Employee employeeDB = repository.findById(empId).get();
        employeeDB.setName(employee.getName());
        employeeDB.setEmail(employee.getEmail());
        return repository.save(employeeDB);
    }
}
