package com.HotelBookingBackend.Booking.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.HotelBookingBackend.Booking.Model.Hotel;

public interface HotelRepository extends JpaRepository<Hotel, Long>{
	@Query(value="Select * from hotel where city = :city and state=:state",nativeQuery = true)
	List<Hotel> searchHotelInArea(String city, String state);

}
