package com.example.bank.controller;

import com.example.bank.entity.Users;
import com.example.bank.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/users")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @PostMapping("/register")
    public Users registerUser(@RequestBody Users user) {
        return userService.registerUser(user);
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
