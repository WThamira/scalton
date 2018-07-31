package com.thamira.example.controller;

import java.util.Date;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.thamira.example.command.OrderMakeCommand;

@RestController
public class OrderController {

	private final CommandGateway commandGateway;

	public OrderController(CommandGateway commandGateway) {
		this.commandGateway = commandGateway;
	}

	@PostMapping
	public ResponseEntity<String> fileComplaint(@RequestBody Map<String, String> request){
//		OrderMakeCommand order = new OrderMakeCommand(Long.parseLong(request.get("id")),
//				new Date(request.get("orderDate")), Long.parseLong(request.get("costomerId")),
//				Long.parseLong(request.get("productId")), Integer.parseInt(request.get("count")),
//				Long.parseLong(request.get("sellPrice")));
//		CompletableFuture<Object> s = commandGateway.send(order);
//		try {
//			Object a = s.get();
//		} catch (InterruptedException | ExecutionException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		OrderMakeCommand order = new OrderMakeCommand((long)123, new Date(), (long)123, (long)123,123, (long)123);
		CompletableFuture<Object> s = commandGateway.send(order);
		try {
			Object a = s.get();
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ResponseEntity.ok().build();
	}
}
