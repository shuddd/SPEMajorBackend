package com.tripbuddy.start.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tripbuddy.start.Entity.Booking;

public interface BookRepository extends JpaRepository<Booking, Long> {



}
