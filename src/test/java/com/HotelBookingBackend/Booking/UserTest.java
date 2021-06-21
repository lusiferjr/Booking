package com.HotelBookingBackend.Booking;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.checkerframework.checker.units.qual.A;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.HotelBookingBackend.Booking.Model.User;
import com.HotelBookingBackend.Booking.Repository.UserRepository;
import com.HotelBookingBackend.Booking.Service.UserService;

@SpringBootTest
public class UserTest {
	@Autowired
	UserService userService;
	@MockBean
	UserRepository userRepository;
@Test
	public void getUserTest() {
		when(userRepository.findAll()).thenReturn(Stream.of(new User("test1", "test1", "test1", "test1@gmail.com"),
				new User("test2", "test2", "test2", "test2@gmail.com")).collect(Collectors.toList()));
		assertEquals(false, userService.fetchAllUsers().isError());
	}

}
