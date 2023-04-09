package com.wasim.hotelapp;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.wasim.hotelapp.entity.Address;
import com.wasim.hotelapp.entity.Delivery;
import com.wasim.hotelapp.entity.Hotel;
import com.wasim.hotelapp.entity.Menu;
import com.wasim.hotelapp.service.DeliveryService;
import com.wasim.hotelapp.service.HotelService;

@SpringBootApplication
public class RestapiHotelApplicationSpringApplication implements CommandLineRunner{

	
	public static void main(String[] args) {
		SpringApplication.run(RestapiHotelApplicationSpringApplication.class, args);
	}

	@Autowired
	HotelService hotelService;
	
	@Autowired
	DeliveryService deliveryService;
	
	@Override
	public void run(String... args) throws Exception {
		
//		Address address = new Address("Bogra", "Biman More", 1200, "Bogra");
//		
//		Menu menu1 = new Menu("BanCake", 50);
//		Menu menu2 = new Menu("Burger", 450);
//		Set<Menu> menuList = new HashSet<>(Arrays.asList(menu1, menu2));
//		
//		Delivery deliv1 = deliveryService.getDeliveryByPartner("Uber");
//		Set<Delivery> deliveryList = new HashSet<>(Arrays.asList(deliv1));
//		
//		Hotel hotel = new Hotel("Momo INN", address, menuList, deliveryList);
//		
//		hotelService.addHotel(hotel);
		
		Hotel hotelById = hotelService.getHotelById(1);
		System.out.println(hotelById);
		
	}

}
