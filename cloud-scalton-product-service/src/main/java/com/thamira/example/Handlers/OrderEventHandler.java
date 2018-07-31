package com.thamira.example.Handlers;

import org.axonframework.config.ProcessingGroup;
import org.axonframework.eventhandling.EventHandler;
import org.springframework.web.bind.annotation.RestController;

import com.thamira.example.event.OrderEvent;
import com.thamira.example.event.OrderUpdateEvent;

@ProcessingGroup("statistics")
@RestController
public class OrderEventHandler {
	@EventHandler
	protected void on(OrderEvent event) {
		System.out.println("Create (EventHandler) "+event);
	}
	@EventHandler
	protected void on(OrderUpdateEvent event) {
		System.out.println("Create (EventHandler) "+event);
	}
}
