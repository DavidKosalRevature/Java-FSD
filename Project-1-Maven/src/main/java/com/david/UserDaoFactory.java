package com.david;

public class UserDaoFactory {

	private UserDaoFactory(){
		
	}
	
	private static UserDao dao;
	
	public static UserDao getUserDao() {
		if(dao == null) {
			dao = new UserDaoImpl();
		}
		return dao;
	}
	
}
