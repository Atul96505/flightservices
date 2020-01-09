package com.bharath.flightservices.flightservices.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bharath.flightservices.flightservices.entities.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Integer> {

}
