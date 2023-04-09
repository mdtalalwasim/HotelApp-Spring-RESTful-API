package com.wasim.hotelapp.entity;


import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Hotel {
	
	@Id
	@GeneratedValue(generator = "hotel_id", strategy = GenerationType.IDENTITY)
	@SequenceGenerator(name="hotel_id", sequenceName = "hotel_id")
	private Integer hotelId;
	
	private String hotelName;
	
	@OneToOne(cascade = CascadeType.ALL) 
	@JoinColumn(name = "address_id")
	private Address address;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "hotel_id")
	private Set<Menu> menuList;
	
	//@ManyToMany(cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
	@ManyToMany(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
	@JoinTable(name = "hotel_delivery", joinColumns = @JoinColumn(name="hotel_id"), inverseJoinColumns = @JoinColumn(name="delivery_id"))
	private Set<Delivery> deliveryList;

	public Hotel(String hotelName, Address address, Set<Menu> menuList, Set<Delivery> deliveryList) {
		super();
		this.hotelName = hotelName;
		this.address = address;
		this.menuList = menuList;
		this.deliveryList = deliveryList;
	}

	@Override
	public String toString() {
		return "Hotel [hotelName=" + hotelName + ", address=" + address + ", menuList=" + menuList + ", deliveryList="
				+ deliveryList + "]";
	}
	
	
	
	
}
