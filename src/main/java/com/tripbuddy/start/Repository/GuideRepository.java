package com.tripbuddy.start.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tripbuddy.start.Entity.Guide;


public interface GuideRepository extends JpaRepository<Guide, Long> {

}
