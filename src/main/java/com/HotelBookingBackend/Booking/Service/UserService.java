package com.HotelBookingBackend.Booking.Service;

import org.springframework.stereotype.Service;

import com.HotelBookingBackend.Booking.Request.AddUserRequest;
import com.HotelBookingBackend.Booking.Request.UpdateUserRequest;
import com.HotelBookingBackend.Booking.Response.Response;

@Service
public interface UserService {

	Response addUser(AddUserRequest user);

	Response updateUser(UpdateUserRequest userupdate);

	Response fetchAllUsers();

	Response deleteUser(Long id);
	
}
