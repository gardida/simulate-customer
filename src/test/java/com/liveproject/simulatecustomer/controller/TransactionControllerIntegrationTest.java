package com.liveproject.simulatecustomer.controller;
import com.liveproject.simulatecustomer.model.Transaction;
import com.liveproject.simulatecustomer.service.TransactionService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.Currency;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@SpringBootTest
class TransactionControllerIntegrationTest {

    @Mock
    private TransactionService transactionService;

    @InjectMocks
    private TransactionController transactionController = new TransactionController(transactionService);

    @BeforeEach
    void setMockOutput() {
        List<Transaction> transactionList = List.of(
                new Transaction("Debit", "123", "GBP", BigDecimal.TEN, "David 1", "David1.jpg"),
                new Transaction("Debit", "456", "USD", BigDecimal.ONE, "David 2", "David2.jpg"));
        when(transactionService.findAllByAccountNumber("123")).thenReturn(transactionList);
    }

    @Test
    void findTransactionsByAccountNumber() {
        assertEquals(2, transactionController.findTransactionsByAccountNumber("123").size());
    }
}