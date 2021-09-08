package com.revature;

public class Employee {
    private String name;

    public Employee() {
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
        return "Employee{" +
                "name='" + name + '\'' +
                '}';
    }

    public void init(){
        System.out.println("Employee init is called");
    }

    public void destroy(){
        System.out.println("Employee destroy is called");
    }
}
