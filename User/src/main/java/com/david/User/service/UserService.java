package com.david.User.service;

import com.david.User.dto.Department;
import com.david.User.dto.UserResponseDTO;
import com.david.User.entity.User;
import com.david.User.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    @Autowired
    private RestTemplate restTemplate;

    public List<User> getAllUser() {
        return repository.findAll();
    }

    public User saveUser(User user) {
        return repository.save(user);
    }

    public UserResponseDTO getUserWithDepartment(Long userId) {
        UserResponseDTO dto = new UserResponseDTO();
        User user = repository.findByUserId(userId);
        Department department = restTemplate.getForObject("http://DEPARTMENT-SERVICE/departments/"
                + user.getDepartmentId(), Department.class);
        dto.setDepartment(department);
        dto.setUser(user);
        return dto;
    }

}
