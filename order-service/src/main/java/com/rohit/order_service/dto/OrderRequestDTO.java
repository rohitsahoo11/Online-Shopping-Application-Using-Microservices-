package com.rohit.order_service.dto;

import java.math.BigDecimal;

public class OrderRequestDTO {
	
	private String orderNumber;
	private String skuCode;
	private BigDecimal price;
	private Integer quantity;
	
	public OrderRequestDTO() {
		super();
	}

	public OrderRequestDTO(String orderNumber, String skuCode, BigDecimal price, Integer quantity) {
		super();
		this.orderNumber = orderNumber;
		this.skuCode = skuCode;
		this.price = price;
		this.quantity = quantity;
	}

	public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public String getSkuCode() {
		return skuCode;
	}

	public void setSkuCode(String skuCode) {
		this.skuCode = skuCode;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	
	
	
}
