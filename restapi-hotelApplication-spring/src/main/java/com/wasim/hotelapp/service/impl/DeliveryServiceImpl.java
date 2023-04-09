package com.wasim.hotelapp.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wasim.hotelapp.entity.Delivery;
import com.wasim.hotelapp.repository.DeliveryRepository;
import com.wasim.hotelapp.service.DeliveryService;

import jakarta.transaction.Transactional;

@Service
public class DeliveryServiceImpl implements DeliveryService{

	@Autowired
	DeliveryRepository deliveryRepository;
	
	@Override
	public void updateDelivery(Delivery delivery) {
		
		deliveryRepository.save(delivery);
	}

	@Override
	public void deleteDeliveryById(int deliveryId) {
		deliveryRepository.deleteById(deliveryId);
		
	}

	@Override
	@Transactional
	public Delivery getDeliveryById(int deliveryId) {
		// TODO Auto-generated method stub
		return deliveryRepository.findById(deliveryId).get();
	}

	@Override
	@Transactional
	public Delivery getDeliveryByPartner(String deliveryPartnerName) {
		// TODO Auto-generated method stub
		return deliveryRepository.findByDeliveryPartnerName(deliveryPartnerName);
	}

}
