package com.example.warehouses.Repository;

import com.example.warehouses.Model.Warehouse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface WarehouseRepository extends JpaRepository<Warehouse, Integer> {
    @Procedure(name = "ReturnWarehouses")
    List<Warehouse> returnWarehouses(@Param("w_id") Integer wId, @Param("w_createdBy") Integer wCreatedBy, @Param("w_name") String wName);


    @Procedure(name = "InsertWarehouse")
    int insertWarehouse(@Param("w_name") String name, @Param("w_description") String description, @Param("w_createdBy") int createdBy);

    @Procedure(name = "DeleteWarehouse")
    Integer deleteWarehouses(@Param("w_warehouseIDs") String warehouseIds);

}
