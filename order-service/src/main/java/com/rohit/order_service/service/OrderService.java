package com.rohit.order_service.service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rohit.order_service.client.InventoryClient;
import com.rohit.order_service.dto.OrderRequestDTO;
import com.rohit.order_service.dto.OrderResponseDTO;
import com.rohit.order_service.model.Order;
import com.rohit.order_service.repository.OrderRepository;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepository repo;
	
	@Autowired
	private InventoryClient client;
	
	
	public OrderResponseDTO placeOrder(OrderRequestDTO dto) {
		
		boolean isAvailabel = client.isInStock(dto.getSkuCode(), dto.getQuantity());
		
		if(isAvailabel) {
			Order order = new Order();
			
			order.setOrderNumber(UUID.randomUUID().toString());
			order.setPrice(dto.getPrice());
			order.setQuantity(dto.getQuantity());
			order.setSkuCode(dto.getSkuCode());
			
			Order saved = repo.save(order);
			
			
			return new OrderResponseDTO(
						saved.getId(),
						saved.getOrderNumber(),
						saved.getSkuCode(),
						saved.getPrice(),
						saved.getQuantity()
					);

		}
		else {
			throw new RuntimeException("Order with the sku code not available.");
		}
		
				
	}
	
}
