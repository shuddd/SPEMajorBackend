package com.tripbuddy.start.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.tripbuddy.start.Entity.Admin;
import com.tripbuddy.start.Repository.AdminRepository;

public class AdminServiceImpl implements AdminService{

	@Autowired
	private AdminRepository adminRepo;
	
	@Override
	public Admin login(String emailId, String password) {
		return adminRepo.findByEmailIdAndPassword(emailId, password);
	}
	
	
}
