package com.example.warehouses.Model;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;

//@Entity
//@Table(name = "users")
//public class Users {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "ID")
//    private Long ID;
//
//    @Nullable
//    @Column(name = "FullName")
//    private String  FullName;
//    @Nullable
//    @Column(name = "Username")
//    private String Username;
//    @Column(name = "Password")
//    private String Password;
//    @Nullable
//    @Column(name = "UserType")
//    private String UserType;
//    // Getters and Setters
//}
//


@Entity
@Table(name = "users")
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fullName;

    private String userType;


    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }
}
