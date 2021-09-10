package com.revature.springbootdemo.controller;

import com.revature.springbootdemo.entity.Employee;
import com.revature.springbootdemo.service.EmployeeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService service;

    private final Logger Logger = LoggerFactory.getLogger(EmployeeController.class);

    @PostMapping("/employees")
    public Employee saveEmployee(@Valid @RequestBody Employee employee){
        Logger.info("saved employee");
        return service.saveEmployee(employee);
    }

    @GetMapping("/employees")
    public List<Employee> getEmployees(){
        Logger.info("get ALL employees");
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
