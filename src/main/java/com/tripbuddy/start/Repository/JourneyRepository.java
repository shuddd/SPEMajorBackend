package com.tripbuddy.start.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tripbuddy.start.Entity.Journey;

public interface JourneyRepository extends JpaRepository<Journey, Long>{

	
}
