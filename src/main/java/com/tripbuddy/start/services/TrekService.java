package com.tripbuddy.start.services;

import java.util.List;

import com.tripbuddy.start.Entity.*;

public interface TrekService {

	
	
	public List<TrekRoutes> getTreks();
	
	public TrekRoutes addTrek(TrekRoutes trek);
	
	
}
