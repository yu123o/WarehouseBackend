package com.example.warehouses.Repository;

import com.example.warehouses.Model.Item;
import com.example.warehouses.Model.Warehouse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ItemRepository extends JpaRepository<Item, Integer> {
    @Procedure(name = "InsertItem")
    Integer insertItem(
            @Param("i_name") String name,
            @Param("i_description") String description,
            @Param("i_quantity") int quantity,
            @Param("i_warehouseID") int warehouseID
    );
    @Procedure(name = "ReturnItem")
     List<Item> returnItems(@Param("i_WearhouseID") Integer iWearhouseID);

}
