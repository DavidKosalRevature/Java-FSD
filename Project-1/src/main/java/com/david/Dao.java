package com.david;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Dao {
	
	SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	Session session = factory.openSession();
	
	public void saveDetails(String name, String email, String password, String type) {
		

		Employee employee = new Employee();
		employee.setEmployeeName(name);
		employee.setEmail(email);
		employee.setPassword(password);
		employee.setType(type);
		Transaction transaction = session.beginTransaction();
		try {
			session.save(employee);
			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();

		}
		session.close();
	}
	
	public Employee checkLogin(String email, String password) {
		
		String hql = "from employee_table e where e.email = :email and e.password = :password";
		Query query = session.createQuery(hql);
		query.setParameter("email", email);
		query.setParameter("password", password);
		query.setMaxResults(1);
		
		Employee employee = (Employee) query.uniqueResult();
		
		return employee;
		
	}
	
	public void saveTicket(String name, Double amount, String expense, String status, String descr, String timestamp) {
		Ticket ticket = new Ticket();
		ticket.setName(name);
		ticket.setType(expense);
		ticket.setStatus(status);
		ticket.setAmount(amount);
		ticket.setDesc(descr);
		ticket.setTimestamp(timestamp);
		Transaction transaction = session.beginTransaction();
		try {
			session.save(ticket);
			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();

		}
		session.close();
		
	}
	
	public List<Ticket> getTickets() {
		String HQL = "from Ticket";
		Query query = session.createQuery(HQL);
		List<Ticket> results = query.list();
		
		return results;
		
	}
	
	public List<Ticket> getEmployeeTickets(String name) {
		String HQL = "from Ticket t where t.name = :name";
		Query query = session.createQuery(HQL);
		query.setParameter("name", name);
		List<Ticket> results = query.list();
		
		return results;
		
	}
}
