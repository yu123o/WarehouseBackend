package com.example.warehouses.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "supplyDocuments")
public class SupplyDocument {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "created_by")
    private Integer createdBy;
    private String name;
    private String subject;
    @Column(name = "created_date_and_time")
    private String createdDateAndTime;
    private Integer itemId;

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

    public String getSubject() {
        return subject;
    }
    public void setSubject(String subject) {
        this.subject = subject;
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
    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

}
