package com.HotelBookingBackend.Booking.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.HotelBookingBackend.Booking.Model.Booking;

public interface BookingRepository extends JpaRepository<Booking, Long>{

}
