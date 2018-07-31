package com.thamira.example.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.thamira.example.model.OrderItem;

public interface OrderItemRepository extends PagingAndSortingRepository<OrderItem, Long> {

}
