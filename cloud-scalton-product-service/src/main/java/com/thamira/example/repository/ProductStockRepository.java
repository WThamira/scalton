package com.thamira.example.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.thamira.example.model.ProductStock;

public interface ProductStockRepository extends PagingAndSortingRepository<ProductStock, Long>{

}
