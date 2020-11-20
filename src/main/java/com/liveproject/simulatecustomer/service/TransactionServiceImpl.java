package com.liveproject.simulatecustomer.service;

import com.liveproject.simulatecustomer.model.Transaction;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Currency;
import java.util.List;

@Service
public class TransactionServiceImpl implements TransactionService {

    public List<Transaction> findAllByAccountNumber(String accountNumber) {
        return List.of(
                new Transaction("Debit", "123", Currency.getInstance("GBP"), BigDecimal.TEN, "David 1", "David1.jpg"),
                new Transaction("Debit", "456", Currency.getInstance("USD"), BigDecimal.ONE, "David 2", "David2.jpg"));
    }

}
