package com.wasim.hotelapp.entity;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.SequenceGenerator;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Delivery {
	
	@Id
	@GeneratedValue(generator = "deliv_id", strategy = GenerationType.IDENTITY)
	@SequenceGenerator(name="deliv_id", sequenceName = "delivery_id")
	private Integer deliveryId;
	
	private String deliveryPartnerName;
	
	private double deliveryCharges;
	
	@ManyToMany(mappedBy = "deliveryList", cascade=CascadeType.ALL)//Hotel is the owner of this ManyToMany Relation and "deliveryList" is the field of Hotel Class
	private Set<Hotel> hotelList = new HashSet<>();
	
	public Delivery(String deliveryPartnerName, double deliveryCharges) {
		super();
		this.deliveryPartnerName = deliveryPartnerName;
		this.deliveryCharges = deliveryCharges;
	}
	
	@Override
	public String toString() {
		return "Delivery [deliveryPartnerName=" + deliveryPartnerName + ", deliveryCharges=" + deliveryCharges + "]";
	}
	
	
	
}
