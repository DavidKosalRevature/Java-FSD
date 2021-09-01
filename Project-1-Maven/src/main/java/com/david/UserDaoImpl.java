package com.david;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class UserDaoImpl implements UserDao {
	SessionFactory factory = null;
	
	public UserDaoImpl() {
		this.factory = HibernateUtil.getSessionFactory();
	}
	

	public void addTicket(Ticket ticket){
		Session session = null;
		Transaction transaction = null;
		try {
			session = factory.openSession();
			transaction = session.beginTransaction();
			session.save(ticket);
			transaction.commit();
		} catch(Exception e) {
			if(transaction != null) {
				transaction.rollback();
			}
		} finally {
			session.close();
		}

	}

}
