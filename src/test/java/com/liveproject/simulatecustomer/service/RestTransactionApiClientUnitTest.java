package com.liveproject.simulatecustomer.service;

import com.liveproject.simulatecustomer.adaptor.OBTransactionAdapter;
import com.liveproject.simulatecustomer.model.*;
import okhttp3.mockwebserver.MockWebServer;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;

@ExtendWith(MockitoExtension.class)
class RestTransactionApiClientUnitTest {

    RestTransactionApiClient restTransactionApiClient;
    @Mock
    private WebClient.Builder webClientBuilder;
    @Mock
    private WebClient webClientMock;
    @Mock
    private WebClient.RequestHeadersSpec requestHeadersMock;
    @Mock
    private WebClient.RequestHeadersUriSpec requestHeadersUriMock;
    @Mock
    private Flux<OBTransaction6> obTransaction6Flux;
    @Mock
    private Mono<List<OBTransaction6>> monoListTransactions;
    @Mock
    private WebClient.ResponseSpec responseMock;
    @Mock
    private OBTransactionAdapter obTransactionAdapter;


    @BeforeEach
    void setUp() {
        restTransactionApiClient = new RestTransactionApiClient("", obTransactionAdapter);
    }

    @Test
    void getTransactionByAccountNumber() {

        String accountNumber = "123";

        // Mock amount
        OBTransaction6 obTransaction6 = new OBTransaction6();

        Mockito.lenient().when(webClientBuilder.build()).thenReturn(webClientMock);
        Mockito.lenient().when(webClientMock.get()).thenReturn(requestHeadersUriMock);
        Mockito.lenient().when(requestHeadersUriMock.uri("/open-banking/v3.1/aisp/accounts/{accountNumber}/transactions", accountNumber)).thenReturn(requestHeadersMock);
        Mockito.lenient().when(requestHeadersMock.retrieve()).thenReturn(responseMock);
        Mockito.lenient().when(responseMock.bodyToFlux(OBTransaction6.class)).thenReturn(obTransaction6Flux);
        Mockito.lenient().when(obTransaction6Flux.collectList()).thenReturn(monoListTransactions);
        Mockito.lenient().when(monoListTransactions.block()).thenReturn(List.of(obTransaction6));

        final List<Transaction> transactionList = restTransactionApiClient.getTransactionByAccountNumber(accountNumber);

        assertEquals(1, transactionList.size());
    }
}