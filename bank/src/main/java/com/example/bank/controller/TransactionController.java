package com.example.bank.controller;

import com.example.bank.entity.Accounts;
import com.example.bank.entity.Transactions;
import com.example.bank.service.AccountService;
import com.example.bank.service.TransactionService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api/v1/transactions")
@RequiredArgsConstructor
public class TransactionController {
    private final TransactionService transactionService;

    private final AccountService accountService;

    @PostMapping("/deposit")
    public Transactions deposit(@RequestParam Long accountId, @RequestParam BigDecimal amount) {
        Accounts account = accountService.getAccountById(accountId);
        accountService.deposit(account, amount);
        Transactions transaction = new Transactions();
        transaction.setSenderAccount(account);
        transaction.setReceiverAccount(account);
        transaction.setAmount(amount);
        transaction.setTransactionDate(LocalDateTime.now());
        transaction.setTransactionType("DEPOSIT");
        return transactionService.createTransaction(transaction);
    }

    @PostMapping("/withdraw")
    public Transactions withdraw(@RequestParam Long accountId, @RequestParam BigDecimal amount) {
        Accounts account = accountService.getAccountById(accountId);
        accountService.withdraw(account, amount);
        Transactions transaction = new Transactions();
        transaction.setSenderAccount(account);
        transaction.setReceiverAccount(account);
        transaction.setAmount(amount);
        transaction.setTransactionDate(LocalDateTime.now());
        transaction.setTransactionType("WITHDRAW");
        return transactionService.createTransaction(transaction);
    }

    @PostMapping("/transfer")
    public Transactions transfer(@RequestParam Long senderAccountId, @RequestParam Long receiverAccountId, @RequestParam BigDecimal amount) {
        Accounts senderAccount = accountService.getAccountById(senderAccountId);
        Accounts receiverAccount = accountService.getAccountById(receiverAccountId);
        accountService.transfer(senderAccount, receiverAccount, amount);
        Transactions transaction = new Transactions();
        transaction.setSenderAccount(senderAccount);
        transaction.setReceiverAccount(receiverAccount);
        transaction.setAmount(amount);
        transaction.setTransactionDate(LocalDateTime.now());
        transaction.setTransactionType("TRANSFER");
        return transactionService.createTransaction(transaction);
    }

    @GetMapping("/account")
    public List<Transactions> getTransactionsByAccount(@RequestParam Long accountId) {
        Accounts account = accountService.getAccountById(accountId);
        return transactionService.getTransactionsByAccount(account);
    }
}
