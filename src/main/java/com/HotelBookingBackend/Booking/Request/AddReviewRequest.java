package com.HotelBookingBackend.Booking.Request;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.HotelBookingBackend.Booking.Model.Hotel;
import com.HotelBookingBackend.Booking.Model.User;
import com.fasterxml.jackson.annotation.JsonBackReference;

public class AddReviewRequest {
	private String comment;
	private int rating;
	private Long userid;
	private Long hotelid;
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public Long getUserid() {
		return userid;
	}
	public void setUserid(Long userid) {
		this.userid = userid;
	}
	public Long getHotelid() {
		return hotelid;
	}
	public void setHotelid(Long hotelid) {
		this.hotelid = hotelid;
	}
	
}
