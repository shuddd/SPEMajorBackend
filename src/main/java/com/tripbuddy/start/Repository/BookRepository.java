package com.tripbuddy.start.Repository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.tripbuddy.start.Entity.Booking;

public interface BookRepository extends JpaRepository<Booking, Long> {


	@Query("from Booking where pId in (select pId from TrekRoutes where gId in (select gId from Guide where emailId like ?1))")
	List<Booking> getBookbyId(String guideId);

	//@Query("from Booking where emailId like ?1")
	@Query("from Booking b, Guide g, TrekRoutes t where b.emailID=?1 and b.pId= t.pId and t.gId = g.gId")
	List<Object[]> getCustBookingDetails(String custId);
	
}
