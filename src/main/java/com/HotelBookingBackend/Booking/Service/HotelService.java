package com.HotelBookingBackend.Booking.Service;

import org.springframework.stereotype.Service;

import com.HotelBookingBackend.Booking.Request.AddHotelRequest;
import com.HotelBookingBackend.Booking.Request.UpdateHotelRequest;
import com.HotelBookingBackend.Booking.Request.searchHotelInAreaRequest;
import com.HotelBookingBackend.Booking.Response.Response;

@Service
public interface HotelService {

	Response addHotel(AddHotelRequest hotel);

	Response fetchAllHotels();

	Response deleteHotel(Long id);

	Response updateHotel(UpdateHotelRequest hotelupdate);

	Response searchHotelInArea(searchHotelInAreaRequest searchhotel);

}
