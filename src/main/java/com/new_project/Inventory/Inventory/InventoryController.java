package com.new_project.Inventory.Inventory;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InventoryController {

    @GetMapping("/inventory")
    public InventoryVariable getInventoryVariable(){
        return new InventoryVariable("1","product 1", 2);
    }


}
