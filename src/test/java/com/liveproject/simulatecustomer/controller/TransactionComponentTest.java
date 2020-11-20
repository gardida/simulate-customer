package com.liveproject.simulatecustomer.controller;

import com.liveproject.simulatecustomer.model.Transaction;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;

import java.lang.reflect.Type;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class TransactionComponentTest {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    void findTransactionsByAccountNumber() throws MalformedURLException {
        ResponseEntity<List<Transaction>> response = restTemplate.exchange(
                "http://localhost:" + port + "/transactions/123",
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<Transaction>>() {});

        System.out.println(response.getBody());
        assertEquals("David 1", response.getBody().get(1).getMerchantName());
    }
}