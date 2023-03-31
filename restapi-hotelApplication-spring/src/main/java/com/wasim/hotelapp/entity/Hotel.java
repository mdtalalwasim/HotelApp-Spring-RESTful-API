package com.wasim.hotelapp.entity;


import java.util.Set;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
	@GeneratedValue(generator = "hotel_id", strategy = GenerationType.AUTO)
	@SequenceGenerator(name="hotel_id", sequenceName = "hotel_id")
	private Integer hotelId;
	
	private String hotelName;
	
	@OneToOne
	private Address address;
	
	@OneToMany
	private Set<Menu> menuList;
	
	@ManyToMany
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
