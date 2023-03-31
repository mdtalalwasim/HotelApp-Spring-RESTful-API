package com.wasim.hotelapp.service;

import java.util.List;

import com.wasim.hotelapp.entity.Hotel;

public interface HotelService {
	
	// for CRUD operation
	void addHotel(Hotel hotel);
	void updateHotel(Hotel hotel);
	Hotel getHotelById(int hotelId);
	void deleteHotelById(int hotelId);
	
	
	List<Hotel> getHotelsByCity(String city);
	List<Hotel> getHotelsByMenu(String menuName);
	List<Hotel> getHotelsByDelivery(String deliveryPartnerName);
	List<Hotel> getHotelsByLocation(String location);
	List<Hotel> getHotelsByLocationAndMenu(String location, String menuName);
	
	
}
