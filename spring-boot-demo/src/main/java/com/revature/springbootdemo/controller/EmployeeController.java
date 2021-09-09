package com.revature.springbootdemo.controller;

import com.revature.springbootdemo.entity.Employee;
import com.revature.springbootdemo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService service;

    @PostMapping("/employees")
    public Employee saveEmployee(@RequestBody Employee employee){
        return service.saveEmployee(employee);
    }

    @GetMapping("/employees")
    public List<Employee> getEmployees(){
        return service.fetchEmployeeList();
    }

    @GetMapping("/employees/{id}")
    public Employee getEmployeeById(@PathVariable("id") long employeeId){
        return service.fetchEmployeeById(employeeId);
    }

    @DeleteMapping("/employees/{id}")
    public String deleteEmployeeById(@PathVariable("id") long employeeId){
        service.deleteEmployeeById(employeeId);
        return "employee deleted successfully";
    }

    @PutMapping("employees/{id}")
    public Employee updateEmployee(@PathVariable("id") long employeeId, @RequestBody Employee employee){
        return service.updateEmployee(employeeId, employee);
    }

    @GetMapping("/employees/name/{name}")
    public Employee getEmployeeByName(@PathVariable("name") String employeeName){
        return service.fetchEmployeeByName(employeeName);
    }
}
