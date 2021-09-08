package com.revature;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Student implements InitializingBean, DisposableBean {

    private String name;

    public Student() {
        super();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }


    @Override
    public void destroy() throws Exception {
        //destroy
        System.out.println("Student destroy called");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        //init
        System.out.println("Student init called");
    }
}
