package com.revature;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        System.out.println( "Hello World!" );
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        Employee employee = (Employee) context.getBean("employee1");
        System.out.println(employee);

        Customer customer = (Customer) context.getBean("customer1");
        System.out.println(customer);

        Calculation calculation = (Calculation) context.getBean("calculation1");
        calculation.sum();
        calculation.sub();
    }
}
