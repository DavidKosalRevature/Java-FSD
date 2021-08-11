package com.company;

public class EmployeeDAOFactory {
    private EmployeeDAOFactory(){

    }

    private static UserDAO dao;

    public static UserDAO getEmployeeDao(){
        if(dao == null){
            dao = new EmployeeDAOImpl();
        }
        return dao;
    }
}
