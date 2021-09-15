package com.david.springdatademo.repository;

import com.david.springdatademo.entity.Course;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class CourseRepositoryTest {
    @Autowired
    private CourseRepository repository;

    @Test
    public void displayAllCourse(){
        List<Course> courses = repository.findAll();
        System.out.println(courses);
    }
}
