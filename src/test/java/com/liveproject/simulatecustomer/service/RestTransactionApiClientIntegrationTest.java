package com.liveproject.simulatecustomer.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.liveproject.simulatecustomer.adaptor.OBTransactionAdapter;
import com.liveproject.simulatecustomer.model.*;
import io.restassured.RestAssured;
import okhttp3.mockwebserver.Dispatcher;
import okhttp3.mockwebserver.MockResponse;
import okhttp3.mockwebserver.MockWebServer;
import okhttp3.mockwebserver.RecordedRequest;
import org.junit.After;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

//@ExtendWith(MockitoExtension.class)
class RestTransactionApiClientIntegrationTest {

    private final MockWebServer mockWebServer = new MockWebServer();
    private final RestTransactionApiClient restTransactionApiClient = new RestTransactionApiClient(mockWebServer.url("").toString(), new OBTransactionAdapter());

    @After
    public void tearDown() throws IOException {
        mockWebServer.shutdown();
    }

    @Test
    void getTransactionByAccountNumber() {
        mockWebServer.setDispatcher(dispatcher);
        final List<Transaction> transactionList = restTransactionApiClient.getTransactionByAccountNumber("123");
        assertEquals(1, transactionList.size());
    }

    final Dispatcher dispatcher = new Dispatcher() {
        @Override
        public MockResponse dispatch (RecordedRequest request) throws InterruptedException {
            switch (request.getPath()) {
                case "/open-banking/v3.1/aisp/accounts/123/transactions":
                    return new MockResponse()
                            .setResponseCode(200)
                            .setHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                            .setBody("{ \"items\" : { \"AccountId\" : \"1323\" }}"); // need example json
            }
            return new MockResponse().setResponseCode(404);
        }
    };
}