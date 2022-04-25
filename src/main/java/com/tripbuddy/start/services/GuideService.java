package com.tripbuddy.start.services;

import java.util.List;


import com.tripbuddy.start.Entity.*;

public interface GuideService {

	public List<Guide> getGuides();
	
	public Guide addGuide(Guide course);
}
