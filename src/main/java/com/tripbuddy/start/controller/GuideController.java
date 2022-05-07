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
import com.tripbuddy.start.Entity.Guide;
import com.tripbuddy.start.services.GuideService;


@CrossOrigin
@RestController
public class GuideController {

	@Autowired
	private GuideService guideService;
	
	@GetMapping("/guideget")
	public List<Guide> getTreks()
	{
		return this.guideService.getGuides();
	}
	
	
	@PostMapping("/guidesave")
	public Guide addCourse(@RequestBody Guide course)
	{
		
		return this.guideService.addGuide(course);
	}
	
	
	@PostMapping("/guide/signin")
	public ResponseEntity<String> guideLogin(@RequestBody Guide guide) {
		String uname = guide.getEmailId();
		String pass = guide.getPassword();

		Guide dbGuide = guideService.login(uname, pass);
		if (dbGuide != null) {
			return ResponseEntity.ok(guide.getEmailId());
		} else {
			return ResponseEntity.ok("Username or Password don't match!");
		}
	}
	
	
}
