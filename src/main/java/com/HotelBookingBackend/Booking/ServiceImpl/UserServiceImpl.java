package com.HotelBookingBackend.Booking.ServiceImpl;

import java.util.ArrayList;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.HotelBookingBackend.Booking.Model.User;
import com.HotelBookingBackend.Booking.Repository.UserRepository;
import com.HotelBookingBackend.Booking.Request.AddUserRequest;
import com.HotelBookingBackend.Booking.Request.UpdateUserRequest;
import com.HotelBookingBackend.Booking.Response.Response;
import com.HotelBookingBackend.Booking.Service.UserService;
@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserRepository userRepository;
	@Override
	public Response addUser(AddUserRequest user) {
		Response response=new Response();
		User newuser = new User();
		newuser.setEmail(user.getEmail());
		newuser.setFullname(user.getFullname());
		newuser.setUsername(user.getUsername());
		newuser.setEmail(user.getEmail());
		newuser.setPassword(user.getPassword());
		newuser=userRepository.save(newuser);
		if (newuser == null) {
			response.setError(true);
			response.setMessage("User Not Added");
			response.setResponse(null);
		}
		else {
			response.setError(false);
			response.setMessage("User Added Successfully");
			response.setResponse(user);
		}
		return response;
	}
	@Override
	@Transactional
	public Response updateUser(UpdateUserRequest userupdate) {
		User user=new User();
		Response response=new Response();
		user=userRepository.getById(userupdate.getId());
		user.setEmail(userupdate.getEmail());
		user.setFullname(userupdate.getFullname());
		user.setUsername(userupdate.getUsername());
		user.setPassword(userupdate.getPassword());
		user=userRepository.save(user);
		if (user == null) {
			response.setError(true);
			response.setMessage("User Not updated");
			response.setResponse(null);
		}
		else {
			response.setError(false);
			response.setMessage("User updated Successfully");
			response.setResponse(user);
		}
		
		return response;
	}
	@Override
	public Response fetchAllUsers() {
		ArrayList<User> users=new ArrayList<User>();
		Response response=new Response();
		users=(ArrayList<User>) userRepository.findAll();
		if (users == null) {
			response.setError(true);
			response.setMessage("User Not Added");
			response.setResponse(null);
		}
		else {
			response.setError(false);
			response.setMessage("User Added Successfully");
			response.setResponse(users);
		}
		
	return response;
	}
	@Override
	public Response deleteUser(Long id) {
		User user=new User();
		Response response=new Response();
		try {
		userRepository.deleteById(id);
		response.setError(false);
		response.setMessage("User deleted Successfully");
		response.setResponse(null);
		}
		catch (Exception e) {
			response.setError(true);
			response.setMessage("User Not Added");
			response.setResponse(null);
		}
		return response;
	}



}
