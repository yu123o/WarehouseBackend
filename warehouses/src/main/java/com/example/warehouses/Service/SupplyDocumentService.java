package com.example.warehouses.Service;

import com.example.warehouses.Model.SupplyDocument;
import com.example.warehouses.Model.Warehouse;
import com.example.warehouses.Model.WarehouseResponse;
import com.example.warehouses.Repository.SupplyDocumentRepository;
import com.example.warehouses.Repository.WarehouseRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SupplyDocumentService {
    @Autowired
    private SupplyDocumentRepository supplyDocumentRepository;

    @Transactional
    public List<SupplyDocument> getSupplyDocument(Integer sCreatedBy) {
        try {
            return supplyDocumentRepository.returnSupplyDocuments(sCreatedBy);
        } catch (Exception e) {
            // Log the exception (optional)
            System.out.println("An error occurred during login: " + e.getMessage());
            return null; // or handle the exception as needed
        }
    }

    public WarehouseResponse InsertSupplyDocument(String sName, String sSubject, Integer sCreatedBy, Integer sitemID) {
        try {
            Integer generatedId =  supplyDocumentRepository.insertSupplyDocument(sName, sSubject, sCreatedBy, sitemID);
            return new WarehouseResponse(generatedId);

        } catch (Exception e) {
            System.out.println("An error occurred during login: " + e.getMessage());
            return null; // or handle the exception as needed
        }
    }

    public Integer deleteSupplyDocument(String sId) {
        return supplyDocumentRepository.deleteSupplyDocument(sId);
    }
}
