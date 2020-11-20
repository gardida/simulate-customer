package com.liveproject.simulatecustomer.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Currency;

@Data
@AllArgsConstructor
public class Transaction {
    private String type;
    private String accountNumber;
    private Currency currency;
    private BigDecimal amount;
    private String merchantName;
    private String merchantLogo;
}
