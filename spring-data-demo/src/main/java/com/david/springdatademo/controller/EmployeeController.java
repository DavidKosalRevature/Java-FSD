package com.david.springdatademo.controller;

import com.david.springdatademo.entity.Employee;
import com.david.springdatademo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200/")
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
        return service.getAllEmployees();
    }

    @GetMapping("/employees/{id}")
    public Employee getEmployeeById(@PathVariable("id") long employeeId){
        return service.getEmployeeById(employeeId);
    }

    @DeleteMapping("/employees/{id}")
    public void deleteEmployee(@PathVariable("id") long employeeId){
        service.deleteEmployee(employeeId);
    }

    @PutMapping("/employees/{id}")
    public Employee updateEmployee(@PathVariable("id") long employeeId, @RequestBody Employee employee){
        return service.saveEmployee(employee);
    }
}
