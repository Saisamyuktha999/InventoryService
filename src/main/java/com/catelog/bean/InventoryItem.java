package com.catelog.bean;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.jackson.Jacksonized;

import javax.persistence.*;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor

public class InventoryItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String productCode;
    private int availableQuantity;

    public InventoryItem(String productCode, int availableQuantity)
    {
        this.productCode = productCode;
        this.availableQuantity = availableQuantity;
    }
}
