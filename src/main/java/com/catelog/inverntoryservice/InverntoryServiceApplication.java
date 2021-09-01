package com.catelog.inverntoryservice;

import com.catelog.bean.InventoryItem;
import com.catelog.service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.catelog")
@EnableJpaRepositories(basePackages = "com.catelog.persistence")
@EntityScan(basePackages = "com.catelog.bean")
public class InverntoryServiceApplication implements CommandLineRunner {

    @Autowired
    InventoryService inventoryService;

    public static void main(String[] args) {
        SpringApplication.run(InverntoryServiceApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        inventoryService.insertInventoryItem(new InventoryItem("P101",3));
        inventoryService.insertInventoryItem(new InventoryItem("P102",4));
        inventoryService.insertInventoryItem(new InventoryItem("P103",5));
        inventoryService.insertInventoryItem(new InventoryItem("P104",6));
        inventoryService.insertInventoryItem(new InventoryItem("P105",7));
        inventoryService.insertInventoryItem(new InventoryItem("P106",8));
    }
}
