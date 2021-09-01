package com.catelog.resource;

import com.catelog.bean.InventoryItem;
import com.catelog.service.InventoryService;
import com.catelog.service.InventoryServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/inventories")
public class InventoryResource {
    @Autowired
    InventoryServiceInterface inventoryService;

    @GetMapping(produces = "Application/json")
    List<InventoryItem> getInventoryItems()
    {
        return inventoryService.getInventoryItems();
    }

    @GetMapping(path = "/productcode/{productcode}")
    InventoryItem getInventoryByProductCode(@PathVariable("productcode") String productCode)
    {
        return inventoryService.findInventoryByProductCode(productCode);
    }

}
