package com.david.Department.controller;

import com.david.Department.entity.Department;
import com.david.Department.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {

    @Autowired
    private DepartmentService service;

    @GetMapping("/")
    public List<Department> getDepartment(){
        log.info("get all departments");
        return service.getAllDepartment();
    }

    @PostMapping("/")
    public Department saveDepartment(@RequestBody Department department){
        log.info("save department");
        return service.saveDepartment(department);
    }

    @GetMapping("/{id}")
    public  Department getDepartmentById(@PathVariable("id") Long departmentId){
        log.info("get department by id: " + departmentId);
        return service.getDepartmentById(departmentId);
    }
}
