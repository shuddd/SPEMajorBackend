package com.tripbuddy.start.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tripbuddy.start.Entity.*;
import com.tripbuddy.start.Repository.*;

@Service
public class TrekServiceImpl implements TrekService {
	
	
	@Autowired
	private TrekRepository trackRepo;
	
	@Override
	public List<TrekRoutes> getTreks() {
		// TODO Auto-generated method stub
	//	return list;
		return trackRepo.findAll();
		
	
	}

	@Override
	public TrekRoutes addTrek(TrekRoutes trek) {
		//list.add(course);
		trackRepo.save(trek);
		return trek;
	}



}