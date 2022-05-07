package com.tripbuddy.start.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tripbuddy.start.Entity.Admin;
import com.tripbuddy.start.Repository.AdminRepository;

@Service
public class AdminServiceImpl implements AdminService{

	@Autowired
	private AdminRepository adminRepo;
	
	@Override
	public Admin login(String emailId, String password) {
		return adminRepo.findByEmailIdAndPassword(emailId, password);
	}

	@Override
	public List<Admin> getAdmin() {
		return adminRepo.findAll();	
	}
	
	
	
}
