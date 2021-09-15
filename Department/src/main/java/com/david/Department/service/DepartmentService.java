package com.david.Department.service;

import com.david.Department.entity.Department;
import com.david.Department.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository repository;

    public Department saveDepartment(Department department){
        return repository.save(department);
    }

    public List<Department> getAllDepartment(){
        return repository.findAll();
    }

    public Department getDepartmentById(Long id){
        return repository.findByDepartmentId(id);
    }
}
