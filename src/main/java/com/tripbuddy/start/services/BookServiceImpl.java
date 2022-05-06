package com.tripbuddy.start.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.tripbuddy.start.Entity.*;
import com.tripbuddy.start.Repository.*;
@Service
public class BookServiceImpl implements BookService{
	
	@Autowired
	private BookRepository bookRepo;
	
	@Override
	public List<Booking> getBooking()  {

		return bookRepo.findAll();	
	
	}

	
	@Override
	public Booking addBooking(Booking booking) {
		//list.add(course);
		bookRepo.save(booking);
		return booking;
	}
	
	
	
}
