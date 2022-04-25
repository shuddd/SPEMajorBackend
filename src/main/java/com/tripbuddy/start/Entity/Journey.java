package com.tripbuddy.start.Entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="")
public class Journey {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long pId;

	private String trekName;
	
	private String placeName;
	
	private long price;
	
	private long gId;

	public long getpId() {
		return pId;
	}

	public void setpId(long pId) {
		this.pId = pId;
	}

	public String getTrekName() {
		return trekName;
	}

	public void setTrekName(String trekName) {
		this.trekName = trekName;
	}

	public String getPlaceName() {
		return placeName;
	}

	public void setPlaceName(String placeName) {
		this.placeName = placeName;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	public long getgId() {
		return gId;
	}

	public void setgId(long gId) {
		this.gId = gId;
	}

	public Journey(long pId, String trekName, String placeName, long price, long gId) {
		super();
		this.trekName = trekName;
		this.placeName = placeName;
		this.price = price;
		this.gId = gId;
	}

	public Journey() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Journey [pId=" + pId + ", trekName=" + trekName + ", placeName=" + placeName + ", price=" + price
				+ ", gId=" + gId + "]";
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
//	public void setId(long id) {
//		this.id = id;
//	}
//	public String getFirstName() {
//		return firstName;
//	}
//	public void setFirstName(String firstName) {
//		this.firstName = firstName;
//	}
//	public String getLastName() {
//		return lastName;
//	}
//	public void setLastName(String lastName) {
//		this.lastName = lastName;
//	}
//	public String getEmailId() {
//		return emailId;
//	}
//	public void setEmailId(String emailId) {
//		this.emailId = emailId;
//	}
//	public Employees(long id, String firstName, String lastName, String emailId) {
//		super();
//		this.firstName = firstName;
//		this.lastName = lastName;
//		this.emailId = emailId;
//	}
//	public Employees() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//	
	
}
