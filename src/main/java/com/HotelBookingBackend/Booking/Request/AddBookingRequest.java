package com.HotelBookingBackend.Booking.Request;

import java.util.Date;

public class AddBookingRequest {

	private Long hotelid;
	private Date bookingdate;
	private Date checkoutdate;
	private int numberofrooms;
	public Long getHotelid() {
		return hotelid;
	}
	public void setHotelid(Long hotelid) {
		this.hotelid = hotelid;
	}
	public Date getBookingdate() {
		return bookingdate;
	}
	public void setBookingdate(Date bookingdate) {
		this.bookingdate = bookingdate;
	}
	public Date getCheckoutdate() {
		return checkoutdate;
	}
	public void setCheckoutdate(Date checkoutdate) {
		this.checkoutdate = checkoutdate;
	}
	public int getNumberofrooms() {
		return numberofrooms;
	}
	public void setNumberofrooms(int numberofrooms) {
		this.numberofrooms = numberofrooms;
	}
	
}
