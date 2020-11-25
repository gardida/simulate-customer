package com.liveproject.simulatecustomer.service;

import com.liveproject.simulatecustomer.model.Transaction;
import com.liveproject.simulatecustomer.repository.MerchantDetailsRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionServiceImpl implements TransactionService {

    private final MerchantDetailsRepository merchantDetailsRepository;
    private final RestTransactionApiClient restTransactionApiClient;

    public TransactionServiceImpl(RestTransactionApiClient restTransactionApiClient, MerchantDetailsRepository merchantDetailsRepository) {
        this.restTransactionApiClient = restTransactionApiClient;
        this.merchantDetailsRepository = merchantDetailsRepository;
    }

    public List<Transaction> findAllByAccountNumber(String accountNumber) {
        final List<Transaction> accountTransactionList = restTransactionApiClient.getTransactionByAccountNumber(accountNumber);
        accountTransactionList.forEach(merchantDetailsRepository::addMerchantLogo);
        return accountTransactionList;
    }

}
