package com.HotelBookingBackend.Booking.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.HotelBookingBackend.Booking.Model.Review;

public interface ReviewRepository extends JpaRepository<Review, Long>{
	@Query(value="Select * from review where hotel_id = :hotelid",nativeQuery = true)
	List<Review> fetchReviewOfHotel(Long hotelid);

	

}
