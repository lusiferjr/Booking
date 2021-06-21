package com.HotelBookingBackend.Booking.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.HotelBookingBackend.Booking.Request.AddUserRequest;
import com.HotelBookingBackend.Booking.Request.UpdateUserRequest;
import com.HotelBookingBackend.Booking.Response.Response;
import com.HotelBookingBackend.Booking.Service.UserService;

@RestController
public class UserController {
	@Autowired
	UserService userService;
	
	@PostMapping(path="/addUser")
	public Response addUser(@RequestBody AddUserRequest user) {
		return userService.addUser(user);
	}
	
	@PostMapping(path = "/updateUser")
	public Response updateUser(@RequestBody UpdateUserRequest userupdate) {
		return userService.updateUser(userupdate);
	}
	@GetMapping(path="/fetchUser")
	public Response fetchAllUser() {
		return userService.fetchAllUsers();
	}
	@DeleteMapping(path="/deleteUser")
	public Response deleteUser(@RequestParam Long id) {
		return userService.deleteUser(id);
		
	}
}
