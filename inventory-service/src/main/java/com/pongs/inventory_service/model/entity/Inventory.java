package com.pongs.inventory_service.model.entity;

public class Inventory {
    private Long id;
    private Long productId;
    private Integer quantity;

    public Long getId() {return id;}
    public void setId(Long id) {this.id = id;}

    public Long getProductId() {return productId;}
    public void setProductId(Long productId) {this.productId = productId;}

    public Integer getQuantity() {return quantity;}
}
