package com.liveproject.simulatecustomer.adaptor;

import com.liveproject.simulatecustomer.model.OBTransaction6;
import com.liveproject.simulatecustomer.model.Transaction;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.math.BigDecimal;
import java.util.Objects;

//accepts an OBTransaction6, returns a Transaction
@Service
public class OBTransactionAdapter {

    public Transaction adaptTransaction(OBTransaction6 obTransaction6) {

        BigDecimal amount = BigDecimal.ZERO;
        if (!StringUtils.isEmpty(obTransaction6.getAmount()) && !StringUtils.isEmpty(obTransaction6.getAmount().getAmount()))
            amount = new BigDecimal(obTransaction6.getAmount().getAmount());

        BigDecimal exchangeRate = BigDecimal.ZERO;
        if (!StringUtils.isEmpty(obTransaction6.getCurrencyExchange()) && !StringUtils.isEmpty(obTransaction6.getCurrencyExchange().getExchangeRate()))
            exchangeRate = obTransaction6.getCurrencyExchange().getExchangeRate();

        String unitCurrency = "XXX";
        if (!StringUtils.isEmpty(obTransaction6.getCurrencyExchange()) && !StringUtils.isEmpty(obTransaction6.getCurrencyExchange().getUnitCurrency()))
            unitCurrency = obTransaction6.getCurrencyExchange().getUnitCurrency();

        String type = "UNKNOWN";
        if (!StringUtils.isEmpty(obTransaction6.getCreditDebitIndicator()))
            type = obTransaction6.getCreditDebitIndicator().toString();

        String merchantName = "";
        if (!StringUtils.isEmpty(obTransaction6.getMerchantDetails()) && !StringUtils.isEmpty(obTransaction6.getMerchantDetails().getMerchantName()))
            merchantName = obTransaction6.getMerchantDetails().getMerchantName();

        return new Transaction(
                type,
                obTransaction6.getAccountId(),
                unitCurrency,
                amount.multiply(exchangeRate),
                merchantName,
                "");
    }

}
