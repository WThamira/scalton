package com.thamira.example.model;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Order {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name="order_date")
	@Temporal(TemporalType.DATE)
	private Date orderDate;
	
	@OneToMany(mappedBy="order",cascade=CascadeType.REMOVE)
	private Set<OrderItem> orderItem;
	
	@Column(name="costomer_id")
	private Long costomerId;
}
