package com.rohit.product_service.dto;

import java.math.BigDecimal;

public record ProductRequestDTO(Integer id, String name, String description, BigDecimal price) {

}
