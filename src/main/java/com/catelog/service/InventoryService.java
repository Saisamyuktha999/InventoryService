package com.catelog.service;

import com.catelog.bean.InventoryItem;
import com.catelog.persistence.InventoryDaoInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class InventoryService implements InventoryServiceInterface{
    @Autowired
    InventoryDaoInterface inventoryDao;

    @Override
    public List<InventoryItem> getInventoryItems() {
        return inventoryDao.findAll();
    }

    @Override
    public InventoryItem findInventoryByProductCode(String productCode) {
        return inventoryDao.getInventoryItemByProductCode(productCode);
    }

    @Override
    public InventoryItem insertInventoryItem(InventoryItem inventoryItem) {
        return inventoryDao.save(inventoryItem);
    }
}
