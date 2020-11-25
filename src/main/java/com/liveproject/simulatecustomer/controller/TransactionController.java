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

    private final TransactionService transactionService;

    public TransactionController(final TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    @GetMapping(path="/{accountNumber}", produces = "application/json")
    public List<Transaction> findTransactionsByAccountNumber(@PathVariable("accountNumber") String accountNumber) {
        log.info("Query for " + accountNumber);
        System.out.println(transactionService);
        return transactionService.findAllByAccountNumber(accountNumber);
    }

}
