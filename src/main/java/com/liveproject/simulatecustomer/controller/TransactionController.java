package com.liveproject.simulatecustomer.controller;

import com.liveproject.simulatecustomer.model.Transaction;
import com.liveproject.simulatecustomer.service.TransactionService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("transactions")
@Slf4j
public class TransactionController {

    @Autowired
    private TransactionService transactionService;

    @RequestMapping(path="/{accountNumber}", produces = "application/json")
    public List<Transaction> findTransactionsByAccountNumber(@PathVariable("accountNumber") String accountNumber) {
        log.info("Query for " + accountNumber);
        return transactionService.findAllByAccountNumber(accountNumber);
    }

}
