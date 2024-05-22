package com.example.bank.repository;

import com.example.bank.entity.Accounts;
import com.example.bank.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AccountRepository extends JpaRepository<Accounts, Long> {
    List<Accounts> findByUser(Users user);
}
