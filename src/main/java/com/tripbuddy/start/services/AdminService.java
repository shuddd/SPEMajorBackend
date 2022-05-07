package com.tripbuddy.start.services;

import com.tripbuddy.start.Entity.Admin;

public interface AdminService {

	
	Admin login(String emailId, String password);
	
}
