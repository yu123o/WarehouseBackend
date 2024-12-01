package com.example.warehouses.Repository;

import com.example.warehouses.Model.SupplyDocument;
import com.example.warehouses.Model.Warehouse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface SupplyDocumentRepository extends JpaRepository<SupplyDocument, Integer> {
    @Procedure(name = "ReturnSupplyDocuments")
    List<SupplyDocument> returnSupplyDocuments(@Param("s_createdBy") Integer sCreatedBy);


    @Procedure(name = "InsertSupplyDocument")
    int insertSupplyDocument(@Param("s_name") String name, @Param("s_subject") String description, @Param("s_createdBy") int createdBy, @Param("s_itemID") int itemID);

    @Procedure(name = "DeleteSupplyDocument")
    Integer deleteSupplyDocument(@Param("s_id") String sId);
}
