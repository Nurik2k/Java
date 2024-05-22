package com.example.bank.service;

import com.example.bank.entity.Users;
import com.example.bank.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public Users registerUser(Users user) {
        try {
            return userRepository.save(user);
        } catch (Exception e) {
            return null;
        }
    }

    public List<Users> getAllUsers() {
        try {
            return userRepository.findAll();
        } catch (Exception e) {
            return null;
        }
    }

    public Users getUserById(Long id) {
        try {
            return userRepository.findById(id).orElse(null);
        } catch (Exception e) {
            return null;
        }
    }
}
