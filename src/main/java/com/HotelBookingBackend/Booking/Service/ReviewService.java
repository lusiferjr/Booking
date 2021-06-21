package com.HotelBookingBackend.Booking.Service;

import org.springframework.stereotype.Service;

import com.HotelBookingBackend.Booking.Request.AddReviewRequest;
import com.HotelBookingBackend.Booking.Request.UpdateReviewRequest;
import com.HotelBookingBackend.Booking.Response.Response;

@Service
public interface ReviewService {

	Response addReview(AddReviewRequest review);

	Response updateReview(UpdateReviewRequest reviewupdate);

	Response fetchReviewOfHotel(Long hotelid);

	Response deleteReview(Long id);

}
