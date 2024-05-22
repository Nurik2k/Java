package com.example.bank.service;

import com.example.bank.entity.Accounts;
import com.example.bank.entity.Transactions;
import com.example.bank.repository.TransactionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TransactionService {

    private final TransactionRepository transactionRepository;



    public Transactions createTransaction(Transactions transaction) {
        try {
            return transactionRepository.save(transaction);
        } catch (Exception e) {
            return null;
        }
    }

    public List<Transactions> getTransactionsByAccount(Accounts account) {
        try {
            return transactionRepository.findBySenderAccountOrReceiverAccount(account, account);
        } catch (Exception e) {
            return null;
        }
    }
}
