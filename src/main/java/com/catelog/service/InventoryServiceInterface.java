package com.catelog.service;

import com.catelog.bean.InventoryItem;

import java.util.List;

public interface InventoryServiceInterface {
    List<InventoryItem> getInventoryItems();
    InventoryItem findInventoryByProductCode(String productCode);
    InventoryItem insertInventoryItem(InventoryItem inventoryItem);
}
