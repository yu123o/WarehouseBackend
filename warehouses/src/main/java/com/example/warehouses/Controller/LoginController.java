package com.example.warehouses.Controller;
import com.example.warehouses.Model.Users;
import com.example.warehouses.Service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/auth")
public class LoginController {
    @Autowired
    private LoginService loginService;

    @PostMapping("/login")
    public ResponseEntity<Users> Login(@RequestParam String username, @RequestParam String password) {
        Users user = loginService.UserLogin(username, password);
//        if (user != null) {
            return ResponseEntity.ok(user);
//        } else {
//            return ResponseEntity.ok("Wrong");
//        }
    }
}
