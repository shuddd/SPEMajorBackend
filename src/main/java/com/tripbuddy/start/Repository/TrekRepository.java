package com.tripbuddy.start.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tripbuddy.start.Entity.TrekRoutes;

public interface TrekRepository extends JpaRepository<TrekRoutes, Long>{

	
}
