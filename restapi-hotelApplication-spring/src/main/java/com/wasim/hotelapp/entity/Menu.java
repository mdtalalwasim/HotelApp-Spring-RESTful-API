package com.wasim.hotelapp.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Menu {
	
	@Id
	@GeneratedValue(generator = "menu_id", strategy = GenerationType.AUTO)
	@SequenceGenerator(name="menu_id", sequenceName = "menu_id")
	private Integer menuId;
	
	private String menuName;
	
	private double menuPrice;
	
	@ManyToOne //here we need to add jointCol... later
	private Hotel hotel;
	
	public Menu(String menuName, double menuPrice) {
		super();
		this.menuName = menuName;
		this.menuPrice = menuPrice;
	}
	
	@Override
	public String toString() {
		return "Menu [menuName=" + menuName + ", menuPrice=" + menuPrice + "]";
	}
	
	
	
	
}
