package com.tripbuddy.start.Repository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.tripbuddy.start.Entity.Booking;

public interface BookRepository extends JpaRepository<Booking, Long> {


	@Query("from Booking where pId in (select pId from TrekRoutes where gId in (select gId from Guide where emailID like ?1))")
	List<Booking> getBookbyId(String guideId);

	
	// select * from booking, trek_routes where book
}
