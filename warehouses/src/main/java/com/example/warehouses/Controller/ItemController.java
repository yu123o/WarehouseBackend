package com.example.warehouses.Controller;


import com.example.warehouses.Model.Item;
import com.example.warehouses.Model.ItemResponse;
import com.example.warehouses.Model.Warehouse;
import com.example.warehouses.Service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/items")
public class ItemController {
    @Autowired
    private ItemService itemService;

    @PostMapping("/create")
    public ResponseEntity<ItemResponse> createItem(@RequestBody Item item ) {
        ItemResponse response = itemService.addItem(item.getName(), item.getDescription(), item.getQuantity(), item.getWearhouseID());
        return ResponseEntity.ok(response);
    }
    @PostMapping("/getItems")
    public List<Item> getWarehouses(@RequestBody Item item) {
        return itemService.getItems(item.getWearhouseID());
    }
}
