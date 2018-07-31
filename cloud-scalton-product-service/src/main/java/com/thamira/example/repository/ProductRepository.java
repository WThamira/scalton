package com.thamira.example.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.thamira.example.model.Product;

public interface ProductRepository extends PagingAndSortingRepository<Product, Long>{

}
