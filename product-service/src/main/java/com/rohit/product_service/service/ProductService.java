package com.rohit.product_service.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rohit.product_service.dto.ProductRequestDTO;
import com.rohit.product_service.dto.ProductResponseDTO;
import com.rohit.product_service.model.Product;
import com.rohit.product_service.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository repo;
	
	
	public ProductResponseDTO createProduct(ProductRequestDTO dto) {
		
		Product product = new Product();
		product.setName(dto.name());
		product.setDescription(dto.description());
		product.setPrice(dto.price());
		
		Product saved = repo.save(product);
		
		ProductResponseDTO response = new ProductResponseDTO();
		response.setName(saved.getName());
		response.setDescription(saved.getDescription());
		response.setPrice(saved.getPrice());
		
		return response;
	}
	
	
	public List<ProductResponseDTO> getAllProducts(){
		
		return repo.findAll()
				.stream()
				.map(product -> new ProductResponseDTO(
					product.getId(),
					product.getName(),
					product.getDescription(),
					product.getPrice()
					))
				.toList();
	}
	
}
