package com.tripbuddy.start.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tripbuddy.start.Entity.Admin;
import com.tripbuddy.start.Entity.Customer;
import com.tripbuddy.start.services.AdminService;



@CrossOrigin
@RestController
public class AdminController {

	@Autowired
	private AdminService adminService;
	
	@GetMapping("/adminget")
	public List<Admin> getAdmin()
	{
		return this.adminService.getAdmin();	}
	
	
	
	@PostMapping("/admin/signin")
	public ResponseEntity<String> adminLogin(@RequestBody Admin admin) {
		if ("admin@gmail.com".equals(admin.getEmailId()) && "password".equals(admin.getPassword()))
		{
			return ResponseEntity.ok(admin.getEmailId());
		}
		else
		{
			return ResponseEntity.ok("Username or Password don't match!");
		}
	}
		
//		String uname = admin.getEmailId();
//		String pass = admin.getPassword();
//
//		Admin dbAdmin = adminService.login(uname, pass);
//		if (dbAdmin != null) {
//			return ResponseEntity.ok(admin.getEmailId());
//		} else {
//			return ResponseEntity.ok("Username or Password don't match!");
//		}
	
	
	
	
	
}
