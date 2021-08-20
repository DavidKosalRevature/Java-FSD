package com.company;

public class Employee {
    private int id;
    private String name;
    private String email;
    private String country;
    private String gender;

    public Employee(){

    }

    public Employee(int id, String name, String email, String country, String gender) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.country = country;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
