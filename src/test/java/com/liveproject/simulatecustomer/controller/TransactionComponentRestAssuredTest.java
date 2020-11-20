package com.liveproject.simulatecustomer.controller;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static io.restassured.RestAssured.get;
import static org.hamcrest.Matchers.hasItems;

@SpringBootTest
class TransactionComponentRestAssuredTest {

    @Test
    void findTransactionsByAccountNumber() {
        get("/transactions/123").then().body("merchantName", hasItems("David 1", "David 2"));
    }
}