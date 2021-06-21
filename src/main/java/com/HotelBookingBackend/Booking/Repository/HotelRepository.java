package com.HotelBookingBackend.Booking.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.HotelBookingBackend.Booking.Model.Hotel;

public interface HotelRepository extends JpaRepository<Hotel, Long>{

}
