package com.example.bank.controller;

import com.example.bank.entity.Users;
import com.example.bank.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/users")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @PostMapping("/register")
    public ResponseEntity<Users> registerUser(@RequestParam String name, @RequestParam String password, @RequestParam String email) {
        Users user = new Users();
        user.setName(name);
        user.setPassword(password);
        user.setEmail(email);
        return ResponseEntity.ok(userService.registerUser(user));
    }

    @GetMapping("/")
    public List<Users> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("")
    public Users getUserById(@RequestParam Long id) {
        return userService.getUserById(id);
    }
}
