package com.HotelBookingBackend.Booking.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.HotelBookingBackend.Booking.Model.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
