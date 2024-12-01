package com.example.warehouses.Controller;


import com.example.warehouses.Model.SupplyDocument;
import com.example.warehouses.Model.Warehouse;
import com.example.warehouses.Model.WarehouseResponse;
import com.example.warehouses.Service.SupplyDocumentService;
import com.example.warehouses.Service.WarehouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/supplyDocument")
public class SupplyDocumentController {
    @Autowired
    private SupplyDocumentService supplyDocumentService;

    @PostMapping("/getSupplyDocuments")
    public List<SupplyDocument> getSupplyDocuments(@RequestBody SupplyDocument supplyDocument) {
        return supplyDocumentService.getSupplyDocument(supplyDocument.getCreatedBy());
    }

    @PostMapping("/addSupplyDocument")
    public ResponseEntity<WarehouseResponse> InsertSupplyDocument(@RequestBody SupplyDocument supplyDocument) {
        WarehouseResponse response = supplyDocumentService.InsertSupplyDocument(supplyDocument.getName(), supplyDocument.getSubject(), supplyDocument.getCreatedBy(), supplyDocument.getItemId());
        return ResponseEntity.ok(response);
    }


    @DeleteMapping("/deleteSupplyDocument")
    public ResponseEntity<String> deleteSupplyDocument(@RequestBody String sId) {
        try {
            supplyDocumentService.deleteSupplyDocument(sId);
            return ResponseEntity.ok("Warehouses deleted successfully.");
        } catch (DataAccessException e) {
//            return ResponseEntity.of("Error deleting warehouses: " + e.getMessage());
            return null;
        }
    }
}
