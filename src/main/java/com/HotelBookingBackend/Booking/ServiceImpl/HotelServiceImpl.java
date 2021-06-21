package com.HotelBookingBackend.Booking.ServiceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.HotelBookingBackend.Booking.Model.Hotel;
import com.HotelBookingBackend.Booking.Repository.HotelRepository;
import com.HotelBookingBackend.Booking.Request.AddHotelRequest;
import com.HotelBookingBackend.Booking.Request.UpdateHotelRequest;
import com.HotelBookingBackend.Booking.Response.Response;
import com.HotelBookingBackend.Booking.Service.HotelService;

@Service
public class HotelServiceImpl implements HotelService{
	@Autowired
	HotelRepository hotelrepository;
	@Autowired
	Response response;
	@Override
	public Response addHotel(AddHotelRequest hotel) {
		Hotel newhotel = new Hotel();
		newhotel.setCity(hotel.getCity());
		newhotel.setName(hotel.getName());
		newhotel.setRoom(hotel.getRoom());
		newhotel.setState(hotel.getState());
		newhotel.setStreet(hotel.getStreet());
		newhotel=hotelrepository.save(newhotel);
		if (newhotel == null) {
			response.setError(true);
			response.setMessage("User Not Added");
			response.setResponse(null);
		}
		else {
			response.setError(false);
			response.setMessage("User Added Successfully");
			response.setResponse(newhotel);
		}
		
		return response;
	}

	@Override
	public Response fetchAllHotels() {
		List<Hotel> hotel=new ArrayList<Hotel>();
		hotel=hotelrepository.findAll();
		if (hotel == null) {
			response.setError(true);
			response.setMessage("User Not Added");
			response.setResponse(null);
		}
		else {
			response.setError(false);
			response.setMessage("User Added Successfully");
			response.setResponse(hotel);
		}
		return null;
	}

	@Override
	public Response deleteHotel(Long id) {
		try {
			hotelrepository.deleteById(id);
			response.setError(false);
			response.setMessage("User Added Successfully");
			response.setResponse(null);
		}catch (Exception e) {
			response.setError(true);
			response.setMessage("User Not Added");
			response.setResponse(null);
		}
		return response;
	}

	@Override
	public Response updateHotel(UpdateHotelRequest hotelupdate) {
		Hotel newhotel = new Hotel();
		newhotel=hotelrepository.getById(hotelupdate.getId());
		newhotel.setCity(hotelupdate.getCity());
		newhotel.setName(hotelupdate.getName());
		newhotel.setRoom(hotelupdate.getRoom());
		newhotel.setState(hotelupdate.getState());
		newhotel.setStreet(hotelupdate.getStreet());
		newhotel=hotelrepository.save(newhotel);
		if (newhotel == null) {
			response.setError(true);
			response.setMessage("User Not Added");
			response.setResponse(null);
		}
		else {
			response.setError(false);
			response.setMessage("User Added Successfully");
			response.setResponse(newhotel);
		}
		
		return response;
	}

}
