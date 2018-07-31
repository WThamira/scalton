package com.thamira.example.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.thamira.example.model.Order;

public interface OrderRepository extends PagingAndSortingRepository<Order, Long>{
	
}
