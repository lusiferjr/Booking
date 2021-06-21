package com.HotelBookingBackend.Booking.ServiceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.HotelBookingBackend.Booking.Model.Hotel;
import com.HotelBookingBackend.Booking.Model.Review;
import com.HotelBookingBackend.Booking.Model.User;
import com.HotelBookingBackend.Booking.Repository.HotelRepository;
import com.HotelBookingBackend.Booking.Repository.ReviewRepository;
import com.HotelBookingBackend.Booking.Repository.UserRepository;
import com.HotelBookingBackend.Booking.Request.AddReviewRequest;
import com.HotelBookingBackend.Booking.Request.UpdateReviewRequest;
import com.HotelBookingBackend.Booking.Response.Response;
import com.HotelBookingBackend.Booking.Service.ReviewService;

@Service
public class ReviewServiceImpl implements ReviewService {
	@Autowired
	ReviewRepository reviewRepository;
	@Autowired
	HotelRepository hotelRepository;
	@Autowired
	UserRepository userRepository;
	@Autowired
	Response response;

	@Override
	public Response addReview(AddReviewRequest review) {
		User user = userRepository.getById(review.getUserid());
		Hotel hotel = hotelRepository.getById(review.getHotelid());
		if (user == null || hotel == null) {
			response.setError(true);
			response.setMessage("no user or hotel exists with that id");
			response.setResponse(null);
		}
		Review newreview = new Review();
		newreview.setHotel(hotel);
		newreview.setUser(user);
		newreview.setComment(review.getComment());
		newreview.setRating(review.getRating());
		newreview = reviewRepository.save(newreview);
		if (newreview == null) {
			response.setError(false);
			response.setMessage("Review added");
			response.setResponse(newreview);
		}
		else {
			response.setError(true);
			response.setMessage("Review not added");
			response.setResponse(null);
		}
		return response;
	}

	@Override
	public Response updateReview(UpdateReviewRequest reviewupdate) {
		Review review=reviewRepository.getById(reviewupdate.getId());
		review.setComment(reviewupdate.getComment());
		review.setRating(reviewupdate.getRating());
		review=reviewRepository.save(review);
		if (review == null) {
			response.setError(false);
			response.setMessage("Review added");
			response.setResponse(review);
		}
		else {
			response.setError(true);
			response.setMessage("Review not added");
			response.setResponse(null);
		}
		return response;
	}

	@Override
	public Response fetchReviewOfHotel(Long hotelid) {
		Hotel hotel=hotelRepository.getById(hotelid);
		if(hotel==null) {
			response.setError(true);
			response.setMessage("no hotel with that id found");
			response.setResponse(null);
		}
		List<Review> reviews=new ArrayList<Review>();
		reviews=reviewRepository.fetchReviewOfHotel(hotelid);
		if(reviews.isEmpty()==true) {
			response.setError(true);
			response.setMessage("no Review found for this hotel");
			response.setResponse(null);
		}else {
			response.setError(false);
			response.setMessage("all review of hotel");
			response.setResponse(response);
		}
		return response;
	}

	@Override
	public Response deleteReview(Long id) {
		try {
			reviewRepository.deleteById(id);
			response.setError(false);
			response.setMessage("review deleted");
			response.setResponse(null);
		}catch (Exception e) {
			response.setError(true);
			response.setMessage("review cannot be deleted");
			response.setResponse(null);
		}
		return response;
	}

}
