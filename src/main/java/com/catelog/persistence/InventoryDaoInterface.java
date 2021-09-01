package com.catelog.persistence;

import com.catelog.bean.InventoryItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InventoryDaoInterface extends JpaRepository<InventoryItem, Long> {
    InventoryItem getInventoryItemByProductCode(String productCode);

}
