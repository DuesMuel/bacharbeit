package de.webs.javanuts.beans.service;

import de.webs.javanuts.beans.User;

public class DatabaseService implements IDatabaseService {

	private static IDatabaseService iDatabaseService;
	
	public static IDatabaseService getInstance(){
		if(iDatabaseService == null){
			iDatabaseService = new DatabaseService();
		}
		return iDatabaseService;
	}
	
	@Override
	public User addUser(User user) {
		// TODO Hibernate Implementierung kommt hier rein
		return null;
	}

	@Override
	public User removeUser(User user) {
		// TODO Hibernate Implementierung kommt hier rein
		return null;
	}

	@Override
	public User updateUser(User user) {
		// TODO Hibernate Implementierung kommt hier rein
		return null;
	}

	@Override
	public User getUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

}
