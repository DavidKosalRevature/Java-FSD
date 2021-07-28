package com.company;

class EmployeeException extends RuntimeException{

}

public class Demo15 {
    public static void main(String[] args) {
        throw new EmployeeException();
    }
}
