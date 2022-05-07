package com.tripbuddy.start.Entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Booking {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long Id;
	
	@Column
 private String emailID;
 
 @Column
 private String approved;
	@Column
 private long pId;
	@Column
private long countOfPpl;
	@Column 
private long contactNo;
	
	@Column 
	private Date date;

	public long getId() {
		return Id;
	}

	public void setId(long id) {
		Id = id;
	}

	public String getEmailID() {
		return emailID;
	}

	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}

	public String getApproved() {
		return approved;
	}

	public void setApproved(String approved) {
		this.approved = approved;
	}

	public long getpId() {
		return pId;
	}

	public void setpId(long pId) {
		this.pId = pId;
	}

	public long getCountOfPpl() {
		return countOfPpl;
	}

	public void setCountOfPpl(long countOfPpl) {
		this.countOfPpl = countOfPpl;
	}

	public long getContactNo() {
		return contactNo;
	}

	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Booking(long id, String emailID, String approved, long pId, long countOfPpl, long contactNo, Date date) {
		super();
		Id = id;
		this.emailID = emailID;
		this.approved = approved;
		this.pId = pId;
		this.countOfPpl = countOfPpl;
		this.contactNo = contactNo;
		this.date = date;
	}

	public Booking() {
		super();
		// TODO Auto-generated constructor stub
	}
			
		
}
