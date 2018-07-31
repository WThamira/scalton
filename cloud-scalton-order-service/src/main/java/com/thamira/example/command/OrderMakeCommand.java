package com.thamira.example.command;

import java.util.Date;

import org.axonframework.commandhandling.model.AggregateIdentifier;

import lombok.Value;

@Value
public class OrderMakeCommand {
	
	@AggregateIdentifier
	private Long id;
	private Date orderDate;
	private Long costomerId;
	private Long productId;
	private int count;
	private Long sellPrice;
}
