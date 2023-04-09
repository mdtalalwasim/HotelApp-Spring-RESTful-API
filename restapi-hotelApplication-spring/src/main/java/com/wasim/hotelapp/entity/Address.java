package com.wasim.hotelapp.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Address {
	
	@Id
	@GeneratedValue(generator = "add_id", strategy = GenerationType.IDENTITY)
	@SequenceGenerator(name="add_id", sequenceName = "address_id")
	private Integer addressId;
	
	private String city;
	
	private String streetName;
	
	private long zipCode;
	
	private String state;

	public Address(String city, String streetName, long zipCode, String state) {
		super();
		this.city = city;
		this.streetName = streetName;
		this.zipCode = zipCode;
		this.state = state;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", streetName=" + streetName + ", zipCode=" + zipCode + ", state=" + state
				+ "]";
	}
	
	
	
	
	
}
