package com.HotelBookingBackend.Booking.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.HotelBookingBackend.Booking.Request.AddReviewRequest;
import com.HotelBookingBackend.Booking.Request.AddUserRequest;
import com.HotelBookingBackend.Booking.Request.UpdateReviewRequest;
import com.HotelBookingBackend.Booking.Request.UpdateUserRequest;
import com.HotelBookingBackend.Booking.Response.Response;
import com.HotelBookingBackend.Booking.Service.ReviewService;
@RestController
public class ReviewController {
	
	@Autowired
	ReviewService reviewService;
	@PostMapping(path="/addReview")
	public Response addUser(@RequestBody AddReviewRequest review) {
		return reviewService.addReview(review);
	}
	
	@PostMapping(path = "/updateReview")
	public Response updateUser(@RequestBody UpdateReviewRequest reviewupdate) {
		return reviewService.updateReview(reviewupdate);
	}
	@GetMapping(path="/fetchReviewOfHotel")
	public Response fetchReviewOfHotel(@RequestParam Long hotelid) {
		return reviewService.fetchReviewOfHotel(hotelid);
	}
	@DeleteMapping(path="/deleteReview")
	public Response deleteReview(@RequestParam Long id) {
		return reviewService.deleteReview(id);
		
	}
}
