package com.pongs.order_service.model.dto.response;

import java.time.LocalDateTime;

import com.pongs.order_service.model.entity.Order;

public class OrderResponse {

    private Long id;
    private String username;
    private String productId;
    private Integer quantity;
    private String status;
    private LocalDateTime createdAt;

    public static OrderResponse from(Order order) {
        OrderResponse response = new OrderResponse();
        response.id = order.getId();
        response.username = order.getUsername();
        response.productId = order.getProductId();
        response.quantity = order.getQuantity();
        response.status = order.getStatus();
        response.createdAt = order.getCreatedAt();
        return response;
    }

    public Long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getProductId() {
        return productId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public String getStatus() {
        return status;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
}
