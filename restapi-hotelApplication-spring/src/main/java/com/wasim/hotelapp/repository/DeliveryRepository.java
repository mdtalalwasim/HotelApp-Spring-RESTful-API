package com.wasim.hotelapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wasim.hotelapp.entity.Delivery;

@Repository
public interface DeliveryRepository extends JpaRepository<Delivery, Integer>{
	
	//Derived Queries
	Delivery findByDeliveryPartnerName(String deliveryPartnerName);
}
