package com.new_project.Inventory.Inventory;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class InventoryService {
    public List<InventoryVariables> getInventoryList(){
        return Arrays.asList(new InventoryVariables(
                1L,
                "Product 1",
                1.09f,
                10L
        ));
    }
}
