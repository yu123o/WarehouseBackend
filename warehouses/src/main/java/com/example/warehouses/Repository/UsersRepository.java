package com.example.warehouses.Repository;

import com.example.warehouses.Model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository  extends JpaRepository<Users, Long> {
    @Procedure(name = "UserLogin")
    Users UserLogin(
            @Param("u_username") String username,
            @Param("u_password") String password
    );
}
