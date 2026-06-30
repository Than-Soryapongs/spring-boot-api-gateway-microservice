package com.pongs.inventory_service.mapper;

import com.pongs.inventory_service.model.entity.Inventory;

public interface InventoryMapper {
    Inventory findByProductId(String productId);
    void insert(Inventory inventory);
    void deductStock(String productId, Integer quantity);
}
