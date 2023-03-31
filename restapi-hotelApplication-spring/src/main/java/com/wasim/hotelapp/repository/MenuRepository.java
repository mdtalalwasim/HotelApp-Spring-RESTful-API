package com.wasim.hotelapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wasim.hotelapp.entity.Menu;

@Repository
public interface MenuRepository extends JpaRepository<Menu, Integer>{

}
