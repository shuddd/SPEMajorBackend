package com.tripbuddy.start.services;

import java.util.List;

import com.tripbuddy.start.Entity.Admin;


public interface AdminService {

	
	Admin login(String emailId, String password);
	public List<Admin> getAdmin();
	
}
