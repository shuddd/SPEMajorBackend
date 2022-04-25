package com.tripbuddy.start.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


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
	
}
