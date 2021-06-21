package com.HotelBookingBackend.Booking.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.HotelBookingBackend.Booking.Request.AddHotelRequest;
import com.HotelBookingBackend.Booking.Request.AddUserRequest;
import com.HotelBookingBackend.Booking.Request.UpdateHotelRequest;
import com.HotelBookingBackend.Booking.Request.UpdateUserRequest;
import com.HotelBookingBackend.Booking.Request.searchHotelInAreaRequest;
import com.HotelBookingBackend.Booking.Response.Response;
import com.HotelBookingBackend.Booking.Service.HotelService;

@RestController
public class HotelController {
	@Autowired
	HotelService hotelService;
	@PostMapping(path="/addhotel")
	public Response addHotel(@RequestBody AddHotelRequest hotel) {
		return hotelService.addHotel(hotel);
	}
	
	@PostMapping(path = "/updateHotel")
	public Response updateHotel(@RequestBody UpdateHotelRequest hotelupdate) {
		return hotelService.updateHotel(hotelupdate);
	}
	@GetMapping(path="/fetchHotels")
	public Response fetchAllHotels() {
		return hotelService.fetchAllHotels();
	}
	@DeleteMapping(path="/deleteHotel")
	public Response deleteHotel(@RequestParam Long id) {
		return hotelService.deleteHotel(id);
		
	}
	@PostMapping(path = "/searchHotelInArea")
	public Response searchHotelInArea(@RequestBody searchHotelInAreaRequest searchhotel) {
		return hotelService.searchHotelInArea(searchhotel);
	}

}
