package com.thamira.example.aggregate;

import static org.axonframework.commandhandling.model.AggregateLifecycle.apply;

import java.util.Date;

import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.commandhandling.model.AggregateIdentifier;
import org.axonframework.eventsourcing.EventSourcingHandler;
import org.axonframework.spring.stereotype.Aggregate;

import com.thamira.example.command.OrderMakeCommand;
import com.thamira.example.command.OrderUpdateCommand;
import com.thamira.example.event.OrderEvent;
import com.thamira.example.event.OrderUpdateEvent;

@Aggregate
public class OrderAggregate {
	
	@AggregateIdentifier
	private Long id;
	private Date orderDate;
	private Long costomerId;
	private Long productId;
	private int count;
	private Long sellPrice;
	
	@SuppressWarnings("unused")
	private OrderAggregate() {
	}
	@CommandHandler
	private OrderAggregate(OrderMakeCommand ordermake) {
		apply(new OrderEvent(ordermake.getId(), ordermake.getOrderDate(), ordermake.getCostomerId(), ordermake.getProductId(), ordermake.getCount(), ordermake.getSellPrice()));
	}
	
	@EventSourcingHandler
	public void on(OrderEvent event) {
		this.id=event.getId();
		this.orderDate=event.getOrderDate();
		this.costomerId=event.getCostomerId();
		this.productId=event.getProductId();
		this.count=event.getCount();
		this.sellPrice=event.getSellPrice();
	}
	
	@CommandHandler
	private void OrderAggregateUpdate(OrderUpdateCommand ordermake) {
		apply(new OrderUpdateEvent(ordermake.getId(),ordermake.getProductId(),ordermake.getCount()));
	}
	
	@EventSourcingHandler
	public void on(OrderUpdateEvent event) {
		this.id=event.getId();
		this.productId=event.getProductId();
		this.count=event.getCount();
	}
	
}
