package com.example.bank.entity;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
@Entity
@Table(name = "accounts")
public class Accounts {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "account_number")
    private String accountNumber;

    @Column(name = "balance")
    private BigDecimal balance;

    @ManyToOne
    @JsonBackReference
    @JoinColumn(
            name = "user_id"
    )
    private Users user;

    @OneToMany(mappedBy = "senderAccount")
    @JsonManagedReference
    private List<Transactions> sentTransactions;

    @OneToMany(mappedBy = "receiverAccount")
    @JsonManagedReference
    private List<Transactions> receivedTransactions;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    public void setUserId(Long userId) {
        this.user.setId(userId);
    }

    public List<Transactions> getSentTransactions() {
        return sentTransactions;
    }

    public void setSentTransactions(List<Transactions> sentTransactions) {
        this.sentTransactions = sentTransactions;
    }

    public List<Transactions> getReceivedTransactions() {
        return receivedTransactions;
    }

    public void setReceivedTransactions(List<Transactions> receivedTransactions) {
        this.receivedTransactions = receivedTransactions;
    }
}
