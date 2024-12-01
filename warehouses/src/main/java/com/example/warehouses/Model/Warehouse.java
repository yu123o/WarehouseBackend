package com.example.warehouses.Model;


import jakarta.persistence.*;

@Entity
@Table(name = "wearhouses")
public class Warehouse {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer createdBy;
    private String name;
    private String description;
    private String createdDateAndTime;

    // Getters and setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public String getCreatedDateAndTime() {
        return createdDateAndTime;
    }

    public void setCreatedDateAndTime(String createdDateAndTime) {
        this.createdDateAndTime = createdDateAndTime;
    }
    public Integer getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Integer createdBy) {
        this.createdBy = createdBy;
    }

}
