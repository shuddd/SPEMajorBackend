package com.tripbuddy.start.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.tripbuddy.start.Entity.Customer;
import com.tripbuddy.start.services.CustomerService;


@CrossOrigin
@RestController
public class CustomerController {

	@Autowired
	private CustomerService customerService;
	
	@GetMapping("/customerget")
	public List<Customer> getTreks()
	{
		return this.customerService.getCustomers();	}
	
	
	@PostMapping("/customersave")
	public Customer addCourse(@RequestBody Customer customer)
	{
		
		return this.customerService.addCustomer(customer);
	}
	
	

	@PostMapping("/customersignin")
	public ResponseEntity<String> customerLogin(@RequestBody Customer customer) {
		String uname = customer.getEmailId();
		String pass = customer.getPassword();

		Customer dbCustomer = customerService.login(uname, pass);
		if (dbCustomer != null) {
			return ResponseEntity.ok(customer.getEmailId());
		} else {
			return ResponseEntity.ok("Username or Password don't match!");
		}
	}
	
}
