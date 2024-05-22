package com.example.bank.repository;

import com.example.bank.entity.Accounts;
import com.example.bank.entity.Transactions;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TransactionRepository extends JpaRepository<Transactions, Long> {
    List<Transactions> findBySenderAccountOrReceiverAccount(Accounts senderAccount, Accounts receiverAccount);
}
