package com.tripbuddy.start.services;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.tripbuddy.start.Entity.*;
import com.tripbuddy.start.Repository.*;

@Service
public class GuideServiceImpl implements GuideService {
	
	
	@Autowired
	private GuideRepository guideRepo;
	
	@Override
	public List<Guide> getGuides() {

		return guideRepo.findAll();
		
	
	}

	
	@Override
	public Guide addGuide(Guide guide) {
		//list.add(course);
		guideRepo.save(guide);
		return guide;
	}




}