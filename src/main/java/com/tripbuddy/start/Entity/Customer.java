package com.tripbuddy.start.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer {
 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long Id;
	
	@Column
 private String firstName;
	@Column
 private String lastName;
	@Column
private String emailId;
	@Column 
private String password;
	@Column
	private String gender;
 
 
 
 
 public Customer() {
	super();
	// TODO Auto-generated constructor stub
}
public Customer(String firstName, String lastName, String emailId, String password, String gender) {
	super();
	this.firstName = firstName;
	this.lastName = lastName;
	this.emailId = emailId;
	this.password = password;
	this.gender = gender;
}
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
public String getEmailId() {
	return emailId;
}
public void setEmailId(String emailId) {
	this.emailId = emailId;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
@Override
public String toString() {
	return "Customer [Id=" + Id + ", firstName=" + firstName + ", lastName=" + lastName + ", emailId=" + emailId
			+ ", password=" + password + ", gender=" + gender + "]";
}




}


