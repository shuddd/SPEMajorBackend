package com.tripbuddy.start.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.tripbuddy.start.Entity.Booking;
import com.tripbuddy.start.Entity.Customer;
import com.tripbuddy.start.services.BookService;


@CrossOrigin
@RestController
public class BookController {

	@Autowired
	private BookService bookService;
	
	@PostMapping("/booktrek")
	public Booking addCourse(@RequestBody Booking booking)
	{
		
		return this.bookService.addBooking(booking);
	}
	
	@GetMapping("/bookingget")
	public List<Booking> getBooking()
	{
		
		return this.bookService.getBooking();	}
	
	
		@GetMapping("/booking/{guideId}")
		public List<Booking> getBookings(@PathVariable String guideId)
		{
			return this.bookService.getBookbyid(guideId);
			
		}
		
		
		@PutMapping("/setapprove")
		public Booking updateCourse(@RequestBody Booking booking)
		{
			return this.bookService.setapprove(booking);
		}
		
		@GetMapping("/bookingdetailscust/{custId}")
		public List<Booking> getCustBookingDetails(@PathVariable String custId)
		{
			return this.bookService.getCustBookingDetails(custId);
			
		}
		
		
		
	

}