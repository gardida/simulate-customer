package com.liveproject.simulatecustomer.service;

import com.liveproject.simulatecustomer.model.Transaction;

import java.util.List;

public interface TransactionApiClient {

    List<Transaction> getTransactionByAccountNumber(String accountNumber);
}
