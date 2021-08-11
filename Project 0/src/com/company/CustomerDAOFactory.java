package com.company;

public class CustomerDAOFactory {
    private CustomerDAOFactory(){

    }

    private static UserDAO dao;

    public static UserDAO getCustomerDao(){
        if(dao == null){
            dao = new CustomerDAOImpl();
        }
        return dao;
    }
}
