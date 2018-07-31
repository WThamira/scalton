package com.thamira.example.command;

import org.axonframework.commandhandling.model.AggregateIdentifier;

import lombok.Value;

@Value
public class OrderUpdateCommand {
	@AggregateIdentifier
	private Long id;
	private Long productId;
	private int count;
}
