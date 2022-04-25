package com.tripbuddy.start.Entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name ="guide")
public class Guide {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long gId;
	
	@Column
	private String firstName;
	
	@Column
	private String lastName;
	
	@Column
	private String password;
	
	@Column
	private String address;
	
	@Column
	private String emailId;
	
	@Column
	private long contactNo;

	public long getgId() {
		return gId;
	}

	public void setgId(long gId) {
		this.gId = gId;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public long getContactNo() {
		return contactNo;
	}

	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}

	public Guide(long gId, String firstName, String lastName, String password, String address, String emailId,
			long contactNo) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.address = address;
		this.emailId = emailId;
		this.contactNo = contactNo;
	}

	public Guide() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Guide [gId=" + gId + ", firstName=" + firstName + ", lastName=" + lastName + ", password=" + password
				+ ", address=" + address + ", emailId=" + emailId + ", contactNo=" + contactNo + "]";
	}
	
	
	
	
	
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private long id;
//	
//	@Column(name="first_name")
//	private String firstName;
//	
//	@Column(name="last_name")
//	private String lastName;
//	
//	@Column(name="email_id")
//	private String emailId;
//	public long getId() {
//		return id;
//	}

	
	
}
