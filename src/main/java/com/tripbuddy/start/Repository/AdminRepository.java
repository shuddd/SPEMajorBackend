package com.tripbuddy.start.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tripbuddy.start.Entity.Admin;


public interface AdminRepository extends JpaRepository<Admin, Long> {

	Admin findByEmailIdAndPassword(String emailId, String password);
	
}
