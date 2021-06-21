package com.HotelBookingBackend.Booking;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.HotelBookingBackend.Booking.Model.Hotel;
import com.HotelBookingBackend.Booking.Model.User;
import com.HotelBookingBackend.Booking.Repository.HotelRepository;
import com.HotelBookingBackend.Booking.Service.HotelService;


@SpringBootTest
public class HotelTests {
	@Autowired
	HotelService hotelService;
	@MockBean
	HotelRepository hotelRepository;
	@Test
	public void getUserTest() {
		when(hotelRepository.findAll()).thenReturn(Stream.of(new Hotel("test1","test1", "test1", "test1", 5),
				new Hotel("test2","test2", "test2", "test2", 2)).collect(Collectors.toList()));
		assertEquals(false, hotelService.fetchAllHotels().isError());
	}
}
