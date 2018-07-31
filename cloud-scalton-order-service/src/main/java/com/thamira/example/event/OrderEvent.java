package com.thamira.example.event;

import java.util.Date;

import org.axonframework.commandhandling.model.AggregateIdentifier;

import lombok.Value;

@Value
public class OrderEvent {
	
	@AggregateIdentifier
	private Long id;
	private Date orderDate;
	private Long costomerId;
	private Long productId;
	private int count;
	private Long sellPrice;
}
