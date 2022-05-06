package com.tripbuddy.start.Entity;

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
 private String trekName;
	@Column
 private long pId;
	@Column
private long countOfPpl;
	@Column 
private long contactNo;
	public long getId() {
		return Id;
	}
	public void setId(long id) {
		Id = id;
	}
	public String getTrekName() {
		return trekName;
	}
	public void setTrekName(String trekName) {
		this.trekName = trekName;
	}
	public Long getpId() {
		return pId;
	}
	public void setpId(Long pId) {
		this.pId = pId;
	}
	public Long getCountOfPpl() {
		return countOfPpl;
	}
	public void setCountOfPpl(Long countOfPpl) {
		this.countOfPpl = countOfPpl;
	}
	public Long getContactNo() {
		return contactNo;
	}
	public void setContactNo(Long contactNo) {
		this.contactNo = contactNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Column
	private String address;
	public Booking(long id, String trekName, Long pId, Long countOfPpl, Long contactNo, String address) {
		super();
		
		this.trekName = trekName;
		this.pId = pId;
		this.countOfPpl = countOfPpl;
		this.contactNo = contactNo;
		this.address = address;
	}
	public Booking() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Booking [Id=" + Id + ", trekName=" + trekName + ", pId=" + pId + ", countOfPpl=" + countOfPpl
				+ ", contactNo=" + contactNo + ", address=" + address + "]";
	}
 
 

	
}
