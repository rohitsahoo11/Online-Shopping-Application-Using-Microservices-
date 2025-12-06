package com.rohit.inventory_service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.rohit.inventory_service.service.InventoryService;

@RestController
@RequestMapping("/api/inventory")
@CrossOrigin
public class InventoryController {
	
	@Autowired
	private InventoryService service;
	
	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	public boolean isInStock(@RequestParam String skuCode, @RequestParam Integer quantity) {
		return service.isInStock(skuCode, quantity);
	}
	
}
