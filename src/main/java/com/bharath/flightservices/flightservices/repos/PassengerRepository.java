package com.bharath.flightservices.flightservices.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bharath.flightservices.flightservices.entities.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger, Integer> {

}
