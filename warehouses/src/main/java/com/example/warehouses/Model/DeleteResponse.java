package com.example.warehouses.Model;

public class DeleteResponse {
private Integer deletedCount;
    public DeleteResponse(Integer deletedCount) {
        this.deletedCount = deletedCount;
    }
    // Getter and Setter
    public Integer getdeletedCount() {
        return deletedCount;
    }

    public void setdeletedCount(Integer deletedCount) {
        this.deletedCount = deletedCount;
    }
}
