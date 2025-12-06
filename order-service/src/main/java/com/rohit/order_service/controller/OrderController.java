package com.rohit.order_service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rohit.order_service.dto.OrderRequestDTO;
import com.rohit.order_service.dto.OrderResponseDTO;
import com.rohit.order_service.service.OrderService;

@RestController
@RequestMapping("api/order")
@CrossOrigin
public class OrderController {
	
	@Autowired
	private OrderService service;
	
	@PostMapping
	public ResponseEntity<OrderResponseDTO> createOrder(@RequestBody OrderRequestDTO dto){
		OrderResponseDTO response = service.placeOrder(dto);
		
		return new ResponseEntity<>(response,HttpStatus.CREATED);
	}
}
