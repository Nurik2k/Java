package com.example.bank.controller;

import com.example.bank.entity.Accounts;
import com.example.bank.entity.Users;
import com.example.bank.service.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/accounts")
@RequiredArgsConstructor
public class AccountController {
    private final AccountService accountService;

    @GetMapping("/")
    public List<Accounts> getAccounts() {
        return accountService.getAccounts();
    }

    @PostMapping("/")
    public Accounts createAccount(@RequestBody Accounts account) {
        return accountService.createAccount(account);
    }

    @GetMapping("/user")
    public List<Accounts> getAccountsByUser(@RequestParam Long userId) {
        Users user = new Users();
        user.setId(userId);
        return accountService.getAccountsByUser(user);
    }

    @GetMapping("")
    public Accounts getAccountById(@RequestParam Long id) {
        return accountService.getAccountById(id);
    }
}
