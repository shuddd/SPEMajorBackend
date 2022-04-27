package com.tripbuddy.start.services;

import java.util.List;

import com.tripbuddy.start.Entity.*;

public interface CustomerService {

	public List<Customer> getCustomers();
	
	Customer login(String emailId, String password);
	
	public Customer addCustomer(Customer customer);
}
