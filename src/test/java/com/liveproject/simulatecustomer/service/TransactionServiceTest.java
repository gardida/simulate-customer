package com.liveproject.simulatecustomer.service;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
public class TransactionServiceTest {

    @Autowired
    TransactionService transactionService;

    @DisplayName("Test length is > 0. Expected to fail but compile.")
    @Test
    void findAllByAccountNumber() {
        assertEquals(2, transactionService.findAllByAccountNumber("123").size());
    }
}