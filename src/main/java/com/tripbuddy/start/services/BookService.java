package com.tripbuddy.start.services;

import java.awt.print.Book;
import java.util.List;


import com.tripbuddy.start.Entity.*;
import com.tripbuddy.start.Repository.*;
public interface BookService {

	public Booking addBooking(Booking booking);
	
	public List<Booking> getBooking();
	
}
