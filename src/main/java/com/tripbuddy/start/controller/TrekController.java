package com.tripbuddy.start.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tripbuddy.start.Entity.Guide;
import com.tripbuddy.start.Entity.TrekRoutes;
import com.tripbuddy.start.services.TrekService;


@CrossOrigin
@RestController
public class TrekController {

	@Autowired
	private TrekService trekService;
	
	@GetMapping("/treks")
	public List<TrekRoutes> getTreks()
	{
		return this.trekService.getTreks();
	}
	

	@PostMapping("/treksave")
	public TrekRoutes addCourse(@RequestBody TrekRoutes trek)
	{
		
		return this.trekService.addTrek(trek);
	}
	
}
