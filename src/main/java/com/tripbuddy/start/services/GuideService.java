package com.tripbuddy.start.services;

import java.util.List;


import com.tripbuddy.start.Entity.*;

public interface GuideService {

	public List<Guide> getGuides();
	
	
	Guide login(String emailId, String password);
	
	public Guide addGuide(Guide course);
}
