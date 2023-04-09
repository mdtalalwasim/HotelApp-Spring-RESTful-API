package com.wasim.hotelapp.service;

import com.wasim.hotelapp.entity.Delivery;
import com.wasim.hotelapp.entity.Hotel;

public interface DeliveryService {

	// for CRUD operation
	

	void updateDelivery(Delivery delivery);

	void deleteDeliveryById(int deliveryId);
	
	Delivery getDeliveryById(int deliveryId);
	
	Delivery getDeliveryByPartner(String partnerName);
	
	
}
