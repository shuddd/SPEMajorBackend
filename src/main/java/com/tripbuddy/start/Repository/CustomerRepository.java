package com.tripbuddy.start.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tripbuddy.start.Entity.Customer;
public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
