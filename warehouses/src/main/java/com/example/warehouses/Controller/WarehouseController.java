package com.example.warehouses.Controller;

import com.example.warehouses.Model.DeleteResponse;
import com.example.warehouses.Model.Warehouse;
import com.example.warehouses.Model.WarehouseResponse;
import com.example.warehouses.Service.WarehouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/warehouses")
public class WarehouseController {
    @Autowired
    private WarehouseService warehouseService;

    @PostMapping("/getWarehouses")
    public List<Warehouse> getWarehouses(@RequestBody Warehouse warehouse) {
        return warehouseService.getWarehouses(warehouse.getId(), warehouse.getCreatedBy(), warehouse.getName());
    }

    @PostMapping("/addWarehouse")
    public ResponseEntity<WarehouseResponse> InsertWarehouses(@RequestBody Warehouse warehouse) {
        WarehouseResponse response = warehouseService.InsertWarehouse(warehouse.getName(), warehouse.getDescription(), warehouse.getCreatedBy());
        return ResponseEntity.ok(response);
    }


    @PostMapping("/deleteWarehouse")
    public ResponseEntity<String> deleteWarehouses(@RequestBody String warehouseIds) {
        try {
            DeleteResponse deletedRows = warehouseService.deleteWarehouses(warehouseIds);
//            return ResponseEntity.ok(deletedRows);
            if (deletedRows.getdeletedCount() > 0) {
                return ResponseEntity.ok("Successfully deleted " + deletedRows.getdeletedCount() + " warehouses.");
            } else {
                return ResponseEntity.ok("No warehouses were deleted. Please check the IDs.");
            }
        } catch (DataAccessException e) {
//            return ResponseEntity.of("Error deleting warehouses: " + e.getMessage());
            return null;
        }
    }
}
