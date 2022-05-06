package com.tripbuddy.start.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tripbuddy.start.Entity.Booking;

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

}