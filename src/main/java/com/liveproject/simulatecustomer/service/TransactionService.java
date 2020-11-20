package com.liveproject.simulatecustomer.service;

import com.liveproject.simulatecustomer.model.Transaction;

import java.util.List;

public interface TransactionService {
    public List<Transaction> findAllByAccountNumber(String accountNumber);
}
