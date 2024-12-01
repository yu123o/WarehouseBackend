package com.example.warehouses.Service;

import com.example.warehouses.Model.Users;
import com.example.warehouses.Repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class LoginService {
    @Autowired
    private UsersRepository usersRepository;

    @Transactional(readOnly = false)
    public Users UserLogin(String username, String password) {
        try {
            return usersRepository.UserLogin(username, password);
        } catch (Exception e) {
            // Log the exception (optional)
            System.out.println("An error occurred during login: " + e.getMessage());
            return null; // or handle the exception as needed
        }
    }
}
