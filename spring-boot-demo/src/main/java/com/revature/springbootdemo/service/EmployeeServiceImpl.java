package com.revature.springbootdemo.service;

import com.revature.springbootdemo.entity.Employee;
import com.revature.springbootdemo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Objects;
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
    public List<Employee> fetchEmployeeList() {
        return repository.findAll();
    }

    @Override
    public Employee fetchEmployeeById(long employeeId) {
        Optional<Employee> employee = repository.findById(employeeId);
        if(!employee.isPresent()){
            System.out.println("employee id does not exist");
        }
        return employee.get();
    }

    @Override
    public void deleteEmployeeById(long employeeId) {
        repository.deleteById(employeeId);
    }

    @Override
    public Employee updateEmployee(long employeeId, Employee employee) {

        Employee employeeDB = repository.findById(employeeId).get();

        if(Objects.nonNull(employee.getEmployeeName()) && !"".equalsIgnoreCase(employee.getEmployeeName())){
            employeeDB.setEmployeeName(employee.getEmployeeName());
        }

        if(Objects.nonNull(employee.getEmployeeAddress()) && !"".equalsIgnoreCase(employee.getEmployeeAddress())){
            employeeDB.setEmployeeAddress(employee.getEmployeeAddress());
        }

        return repository.save(employeeDB);
    }

    @Override
    public Employee fetchEmployeeByName(String employeeName){
        return repository.findByEmployeeNameIgnoreCase(employeeName);
    }
}
