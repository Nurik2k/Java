package com.example.bank.service;

import com.example.bank.entity.Accounts;
import com.example.bank.entity.Users;
import com.example.bank.repository.AccountRepository;
import com.example.bank.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
@RequiredArgsConstructor
public class AccountService {
    private final AccountRepository accountRepository;
    private final UserRepository userRepository;


    public Accounts createAccount(Long userId) {
        try {
            Users user = userRepository.findById(userId).orElse(null);
            Accounts account = new Accounts();
            account.setUser(user);
            account.setBalance(BigDecimal.ZERO);
            account.setAccountNumber(generateAccountNumber());
            accountRepository.save(account);
            return account;

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

    private String generateAccountNumber() {
        // Simple account number generation logic for demo purposes
        return "AC" + System.currentTimeMillis();
    }

}
