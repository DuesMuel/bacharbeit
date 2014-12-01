package de.webs.javanuts.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import de.webs.javanuts.beans.service.DatabaseService;
import de.webs.javanuts.beans.service.IDatabaseService;


@ManagedBean(name = "userRegistration")
@RequestScoped
public class UserRegistration {

	private String firstName;
	private String lastName;
	private int matrikelNumber;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getMatrikelNumber() {
		return matrikelNumber;
	}
	public void setMatrikelNumber(int matrikelNumber) {
		this.matrikelNumber = matrikelNumber;
	}
	
	public String processRegistration(){
		System.out.println("Values:");
		System.out.println("Firstname:"+getFirstName());
		System.out.println("Lastname:"+getLastName());
		IDatabaseService databaseService = DatabaseService.getInstance();
		User user = new User ();
		user.setFirstName(this.firstName);
		user.setLastName(this.lastName);
		user.setMatrikelNumber(this.matrikelNumber);
		databaseService.addUser(user);
		
		return null;
	}
	
}
