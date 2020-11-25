package com.liveproject.simulatecustomer.adaptor;

import com.liveproject.simulatecustomer.controller.TransactionController;
import com.liveproject.simulatecustomer.model.OBActiveOrHistoricCurrencyAndAmount9;
import com.liveproject.simulatecustomer.model.OBTransaction6;
import com.liveproject.simulatecustomer.model.Transaction;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@SpringBootTest
class OBTransactionAdapterTest {

//    @Mock
//    OBActiveOrHistoricCurrencyAndAmount9 mockObActiveOrHistoricCurrencyAndAmount9;

    @Mock
    OBTransaction6 obTransaction6;

    @InjectMocks
    private OBTransactionAdapter obTransactionAdapter = new OBTransactionAdapter();

    @BeforeEach
    void setMockOutput() {
        when(obTransaction6.getAmount()).thenReturn(null);
    }

    @Test
    void adaptTransaction() {
        Transaction transaction = obTransactionAdapter.adaptTransaction(obTransaction6);
    }
}