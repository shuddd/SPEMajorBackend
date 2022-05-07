package com.tripbuddy.start.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tripbuddy.start.Entity.Admin;
import com.tripbuddy.start.services.AdminService;



@CrossOrigin
@RestController
public class AdminController {

	@Autowired
	private AdminService adminService;
	
	@PostMapping("/admin/signin")
	public ResponseEntity<String> customerLogin(@RequestBody Admin admin) {
		String uname = admin.getEmailId();
		String pass = admin.getPassword();

		Admin dbAdmin = adminService.login(uname, pass);
		if (dbAdmin != null) {
			return ResponseEntity.ok(admin.getEmailId());
		} else {
			return ResponseEntity.ok("Username or Password don't match!");
		}
	}
	
	
	
	
}
