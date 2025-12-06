package com.rohit.inventory_service.dto;

public class InventoryRequestDTO {
	
	private String skuCode;
	private Integer quantity;
	
	public InventoryRequestDTO() {
		super();
	}

	public InventoryRequestDTO(String skuCode, Integer quantity) {
		super();
		this.skuCode = skuCode;
		this.quantity = quantity;
	}

	public String getSkuCode() {
		return skuCode;
	}

	public void setSkuCode(String skuCode) {
		this.skuCode = skuCode;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	
	
}
