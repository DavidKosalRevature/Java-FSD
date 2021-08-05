package com.company;

public class EmployeeDAOFactory {
    private EmployeeDAOFactory(){

    }

    private static EmployeeDAO dao;

    public static EmployeeDAO getEmployeeDao(){
        if(dao == null){
            dao = new EmployeeDAOImpl();
        }
        return dao;
    }
}
