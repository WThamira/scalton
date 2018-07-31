package com.thamira.example.event;

import org.axonframework.commandhandling.model.AggregateIdentifier;

import lombok.Value;

@Value
public class OrderUpdateEvent {
	@AggregateIdentifier
	private Long id;
	private Long productId;
	private int count;
}

