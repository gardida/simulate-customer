package com.liveproject.simulatecustomer.service;

import com.liveproject.simulatecustomer.adaptor.OBTransactionAdapter;
import com.liveproject.simulatecustomer.model.OBTransaction6;
import com.liveproject.simulatecustomer.model.Transaction;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class RestTransactionApiClient implements TransactionApiClient {

    private final WebClient webClient;
    private final OBTransactionAdapter obTransactionAdapter;

    public RestTransactionApiClient(@Value("${base.url}") String baseUrl, OBTransactionAdapter obTransactionAdapter) {
        this.webClient = WebClient.builder().baseUrl(baseUrl).defaultHeader(HttpHeaders.CONTENT_TYPE).build();
        this.obTransactionAdapter = obTransactionAdapter;
    }

    @CircuitBreaker(name = "restTransactionApiClient", fallbackMethod = "fallback")
    @Override
    public List<Transaction> getTransactionByAccountNumber(String accountNumber) {
        List<OBTransaction6> obTransaction6List = webClient
                .get()
                .uri("/open-banking/v3.1/aisp/accounts/{accountNumber}/transactions", accountNumber)
                .retrieve()
                .bodyToFlux(OBTransaction6.class)
                .collectList()
                .block()
                ;

        return obTransaction6List.stream()
                .map(obTransactionAdapter::adaptTransaction)
                .collect(Collectors.toList());
    }

    private List<Transaction> fallback(String accountNumber, RuntimeException e) {
        System.out.println("inside fallback...");
        e.printStackTrace();
        return Collections.EMPTY_LIST;
    }

}
