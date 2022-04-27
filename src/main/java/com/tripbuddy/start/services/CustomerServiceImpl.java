package com.tripbuddy.start.services;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.tripbuddy.start.Entity.*;
import com.tripbuddy.start.Repository.*;

@Service
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	private CustomerRepository custRepo;
	
	@Override
	public List<Customer> getCustomers()  {

		return custRepo.findAll();	
	
	}

	
	@Override
	public Customer addCustomer(Customer customer) {
		//list.add(course);
		custRepo.save(customer);
		return customer;
	}
	
	@Override
	public Customer login(String emailId, String password) {
		return custRepo.findByUsernameAndPassword(emailId, password);
	}
	
	
	
	
}
