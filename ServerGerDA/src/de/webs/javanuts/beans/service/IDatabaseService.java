package de.webs.javanuts.beans.service;

import de.webs.javanuts.beans.User;

public interface IDatabaseService {
	
	public  User addUser(User user);
	
	public  User removeUser(User user);

	public  User updateUser(User user);
	
	public User getUser(User user) throws Exception;
	
	
}
