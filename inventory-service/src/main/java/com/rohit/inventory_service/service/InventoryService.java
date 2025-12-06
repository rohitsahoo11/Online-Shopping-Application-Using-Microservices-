package com.rohit.inventory_service.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rohit.inventory_service.repository.InventoryRepository;

@Service
public class InventoryService {

	@Autowired
	private InventoryRepository repo;
	
	
	public boolean isInStock(String skuCode, Integer quantity) {
		return repo.existsBySkuCodeAndQuantityIsGreaterThanEqual(skuCode, quantity);
	}
}
