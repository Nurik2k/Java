package com.example.bank.service;

import com.example.bank.entity.Accounts;
import com.example.bank.entity.Users;
import com.example.bank.repository.AccountRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
@RequiredArgsConstructor
public class AccountService {
    private final AccountRepository accountRepository;


    public Accounts createAccount(Accounts account) {
        try {
            return accountRepository.save(account);
        } catch (Exception e) {
            return null;
        }
    }

    public List<Accounts> getAccounts() {
        try {
            return accountRepository.findAll();
        } catch (Exception e) {
            return null;
        }
    }

    public List<Accounts> getAccountsByUser(Users user) {
        try {
            return accountRepository.findByUser(user);
        } catch (Exception e) {
            return null;
        }
    }

    public Accounts getAccountById(Long id) {
        try {
            return accountRepository.findById(id).orElse(null);
        } catch (Exception e) {
            return null;
        }
    }

    public void deposit(Accounts account, BigDecimal amount) {
        try{
            account.setBalance(account.getBalance().add(amount));
            accountRepository.save(account);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void withdraw(Accounts account, BigDecimal amount) {
        try{
            account.setBalance(account.getBalance().subtract(amount));
            accountRepository.save(account);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void transfer(Accounts sender, Accounts receiver, BigDecimal amount) {
        try {
            withdraw(sender, amount);
            deposit(receiver, amount);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
