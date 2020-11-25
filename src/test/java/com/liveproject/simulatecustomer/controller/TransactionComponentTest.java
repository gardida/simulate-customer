package com.liveproject.simulatecustomer.controller;

import com.liveproject.simulatecustomer.model.Transaction;
import com.liveproject.simulatecustomer.service.TransactionService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.math.BigDecimal;
import java.util.List;

import static io.restassured.module.mockmvc.RestAssuredMockMvc.given;
import static org.hamcrest.Matchers.hasItems;

class TransactionComponentTest {

    @Test
    public void testControllerBodyContent() {

        final TransactionService mockTransactionService = Mockito.mock(TransactionService.class);
        Mockito.when(mockTransactionService.findAllByAccountNumber("1234")).thenReturn(List.of(
                new Transaction("credit", "1234567", "USD", BigDecimal.TEN, "acme", "acme.png")
        ));

        given().standaloneSetup(new TransactionController(mockTransactionService))
                .when()
                .get("/transactions/1234")
                .then()
                .body("accountNumber", hasItems("1234567"));

    }
}