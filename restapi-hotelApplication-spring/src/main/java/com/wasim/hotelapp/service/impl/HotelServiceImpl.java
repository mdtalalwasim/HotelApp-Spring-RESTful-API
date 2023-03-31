package com.wasim.hotelapp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wasim.hotelapp.entity.Hotel;
import com.wasim.hotelapp.repository.HotelRepository;
import com.wasim.hotelapp.service.HotelService;

@Service
public class HotelServiceImpl implements HotelService {

	@Autowired
	HotelRepository hotelRepository;
	
	
	@Override
	public void addHotel(Hotel hotel) {
		hotelRepository.save(hotel);

	}

	@Override
	public void updateHotel(Hotel hotel) {
		hotelRepository.save(hotel);

	}

	@Override
	public Hotel getHotelById(int hotelId) {
		
		return hotelRepository.findById(hotelId).get();
	}

	@Override
	public void deleteHotelById(int hotelId) {
		hotelRepository.deleteById(hotelId);

	}

	@Override
	public List<Hotel> getHotelsByCity(String city) {
		
		return null;
	}

	@Override
	public List<Hotel> getHotelsByMenu(String menuName) {
		
		return null;
	}

	@Override
	public List<Hotel> getHotelsByDelivery(String deliveryPartnerName) {
		
		return null;
	}

	@Override
	public List<Hotel> getHotelsByLocation(String location) {
		
		return null;
	}

	@Override
	public List<Hotel> getHotelsByLocationAndMenu(String location, String menuName) {
		
		return null;
	}

}
