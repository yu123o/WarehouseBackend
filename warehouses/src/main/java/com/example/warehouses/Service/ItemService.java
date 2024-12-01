package com.example.warehouses.Service;

import com.example.warehouses.Model.Item;
import com.example.warehouses.Model.ItemResponse;
import com.example.warehouses.Model.Warehouse;
import com.example.warehouses.Model.WarehouseResponse;
import com.example.warehouses.Repository.ItemRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {
    @Autowired
    private ItemRepository itemRepository;

    public ItemResponse addItem(String name, String description, int quantity, int warehouseID) {
        try {
            Integer generatedId =  itemRepository.insertItem(name, description, quantity, warehouseID);
            return new ItemResponse(generatedId);
        }
    catch (Exception e) {
        System.out.println("An error occurred during login: " + e.getMessage());
        return null; // or handle the exception as needed
    }
    }
    @Transactional
    public List<Item> getItems(Integer i_WearhouseID) {
        try {
            return itemRepository.returnItems(i_WearhouseID);
        } catch (Exception e) {
            // Log the exception (optional)
            System.out.println("An error occurred during login: " + e.getMessage());
            return null; // or handle the exception as needed
        }
    }
}
