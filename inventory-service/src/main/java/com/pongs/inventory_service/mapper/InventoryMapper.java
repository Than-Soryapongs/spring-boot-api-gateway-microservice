package com.pongs.inventory_service.mapper;

import com.pongs.inventory_service.model.entity.Inventory;

public interface InventoryMapper {
    Inventory findByProductId(Long productId);
    void insert(Inventory inventory);
}
