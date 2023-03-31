package com.wasim.hotelapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wasim.hotelapp.entity.Hotel;

@Repository
public interface HotelRepository extends JpaRepository<Hotel, Integer>{

}
