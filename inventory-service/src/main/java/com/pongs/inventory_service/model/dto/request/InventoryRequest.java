package com.pongs.inventory_service.model.dto.request;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

public class InventoryRequest {

    @NotNull(message = "Product ID cannot be null")
    private Long productId;

    @NotNull(message = "Quantity cannot be null")
    @Min(value = 0, message = "Quantity cannot be negative")
    private Integer quantity;

    public Long getProductId() {return productId;}
    public void setProductId(Long productId) {this.productId = productId;}

    public Integer getQuantity() {return quantity;}

}
